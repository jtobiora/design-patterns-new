                                    CHAIN OF RESPONSIBILITY DESIGN PATTERN
Chain of responsibility pattern is used to achieve loose coupling in software design where a request from the client is
passed to a chain of objects to process them. Then the object in the chain will decide themselves who will be processing
the request and whether the request is required to be sent to the next object in the chain or not.

This design pattern allows us to decouple a sender of a request from its receiver by giving multiple objects a chance to
handle that request. Instead of objects maintaining a reference to all receivers, they have only a single reference to their
successor. Hence, neither senders nor receivers has to know about the chain's structure.

This pattern is used when multiple objects can handle a request and the handler doesn't have to be a specific object. Also,
the handler is determined at runtime.
We know that we can have multiple catch blocks in a try-catch block code. Here every catch block is kind of a processor to
process that particular exception. So when an exception occurs in the try block, it’s sent to the first catch block to
process. If the catch block is not able to process it, it forwards the request to next object in chain i.e next catch
block. If even the last catch block is not able to process it, the exception is thrown outside of the chain to the
calling program.
Some of teh principles to keep in mind when adopting this design pattern are:
1.Each processor in the chain will have its implementation for processing a command.
2. Every processor in the chain should have a reference to the next processor.
3. Each processor is responsible for delegating to the next processor
4. Only one processor in the chain handles a given command.

An example given here is a problem where users will need to provide data in any format (it could text files, doc files,
excels, audio, images, videos) and you need to provide them a single interface to upload them into the database.

The problem here is that you need to develop different handlers to save the various formats of data. For example, a text
file save handler does not know how to save an mp3 file.
You can create different objects which process different formats of data and chain them together. When a request comes to a
single object, it will check whether it can process and handle the specfic file format. If it can, it will process it;
otherwise, it will forward it to the next object chained to it.

The intent of this pattern is to avoid coupling the sender of a request to its receiver by giving more than one object
a chance to handle the request. We chain the receiving objects and pass the request along the chain until an object
handles it. This pattern is all about connecting objects in a chain of notification; as a notification travels down the
chain, it’s handled by the first object that is set up to deal with the particular notification.


