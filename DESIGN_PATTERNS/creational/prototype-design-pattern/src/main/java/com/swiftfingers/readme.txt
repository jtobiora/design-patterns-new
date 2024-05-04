                                        PROTOTYPE DESIGN PATTERN
Prototype allows us to hide the complexity of making new instances from the client. The concept is to copy an existing object
rather than creating a new instance from scratch, something that may include costly operations. The existing object acts as a
prototype and contains the state of the object. The newly copied object may change same properties only if required. This
approach saves costly resources and time, especially when the object creation is a heavy process.

Using the prototype pattern, you do not create a new object for each client requesting the object. Instead, you start by
creating a single object, called a prototype and make copies of it for each client requesting the object. In Java, this is
achieved through object cloning, a way to make a copy of an object with the same state as the original object.

A call to super.clone() performs a shallow copy where all the fields values of the original object are copied to the new
object. If a field value is a primitive type, a shallow copy copies the value of the primitive type. But, if a field value is
a reference type, then only the reference is copied, and not the referred object itself. Therefore, both the original and its
clone refer to the same object and if either one modifies the referred object, the modification will be visible to the other.
This might result in unexpected behavior in an application. In such situation, you should perform a deep copy that makes
copies of dynamically allocated memory pointed to by the reference type fields. In a deep copy, the original and the copied
objects are independent of each other and therefore the objects can update their own fields without worrying about any
referencing problems.

When using the prototype pattern, should we go for shallow copy or for deep copy? There is no hard and fast rule, it all
depends on the requirement. If an object has only primitive fields or immutable objects (whose state cannot change, once
created), use a shallow copy. When the object has references to other mutable objects, then either choose shallow copy or
deep copy. For example, if the references are not modified anytime, avoid deep copy and go for shallow copy. But, if you
know that the references will be modified and the modification might affect the intended behavior of the application, then
you need to go for deep copy.