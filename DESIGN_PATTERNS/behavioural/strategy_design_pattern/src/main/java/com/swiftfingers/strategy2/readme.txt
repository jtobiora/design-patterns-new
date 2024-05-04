                                   STRATEGY DESIGN PATTERN
We show an example of strategy design pattern by looking through an Encryptor class. There are different encryption
algorithms that can be used to accomplish this such as AES, TripleDES, Blowfish, etc. Ordinarily, all
these can be bundled in one class but that would mean tight coupling and would violate SOLID principles.

Using our example of data encryption, we will first implement the interface that will be used by all of the different
encryption algorithm-specific classes. Let’s name the interface EncryptionStrategy and name the algorithm specific
classes AesEncryptionStrategy and BlowfishEncryptionStrategy. Ultimately, these are our strategies.

We can now summarize the participants of the strategy pattern as:
1. Strategy (EncryptionStrategy):
  Is an interface common to all supported algorithm-specific classes.
2. ConcreteStrategy (AesEncryptionStrategy and BlowfishEncryptionStrategy):
 Implements the algorithm using the Strategy interface.
3. Context (Encryptor):
  Provides the interface to client for encrypting data. The Context maintains a reference to a Strategy object and is
  instantiated and initialized by clients with a ConcreteStrategy object.