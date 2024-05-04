                                                  PROXY DESIGN PATTERN
The Proxy Pattern is used to create a representative object that controls access to another object, which may be remote, expensive
to create or in need of being secured.

One reason for controlling access to an object is to defer the full cost of its creation and initialization until we actually need to
use it. Another reason could be to act as a local representative for an object that lives in a different JVM. The Proxy can be very
useful in controlling the access to the original object, especially when objects should have different access rights.
In the Proxy Pattern, a client does not directly talk to the original object, it delegates its calls to the proxy object which calls
the methods of the original object. The important point is that the client does not know about the proxy, the proxy acts as an
original object for the client. But there are many variations to this approach.

Proxy means an object representing another object. A Proxy Pattern "provides the control for accessing
the original object". This pattern provides protection for the original object from the outside world. A proxy object hides the original
object and control access to it.

The proxy design pattern is intended to act as a simple wrapper for another object. A proxy object provide a surrogate
or placeholder for another object to control access to it. A proxy is basically a substitute for an intended object
which we create due to many reasons e.g. security reasons or cost associated with creating fully initialized original
object.

Proxy is heavily used to implement lazy loading related usecases where we do not want to create full object until it
is actually needed.

We have the following concepts to illustrate the proxy design pattern:
1. Subject: This may be an interface or class that provides features that can be extended by other classes
2. RealSubject: This class implements or extends the Subject
3. ProxySubject: This class also extends or implements the Subject. At the same time it has a reference to RealSubject

• ProxySubject: 1a. Maintains a reference that lets the proxy access the real subject. Proxy may refer to a Subject if the RealSubject
and Subject interfaces are the same. 1b. Provides an interface identical to Subject’s so that a proxy can be substituted for the
real subject. 1c. Controls access to the real subject and may be responsible for creating and deleting it.
• Subject: 2a. Defines the common interface for RealSubject and Proxy so that a Proxy can be used anywhere a RealSubject is
expected.
• RealSubject: 3a. Defines the real object that the proxy represents.

There are three main variations to the Proxy Pattern:
• A remote proxy provides a local representative for an object in a different address space.
• A virtual proxy creates expensive objects on demand.
• A protection proxy controls access to the original object. Protection proxies are useful when objects should have different
access rights.

A. Remote Proxy:
   The Remote Proxy acts as a local representative of a remote object. A remote object is an object that lives in the
   heap of different JVM or in a different address space. You call methods to the local object which forward that calls on to the remote object.
   Your client object acts like its making remote method calls. But it is calling methods on a heap-local proxy object that handles
   all the low-level details of network communication.

B. Virtual Proxy:
  The Virtual Proxy pattern is a memory saving technique that recommends postponing an object creation until it is needed; it
  is used when creating an object that is expensive in terms of memory usage or processing involved.
  When an application is started, it may not need all of its objects to be available immediately. In such cases, the Virtual
  Proxy pattern suggests deferring objects creation until it is needed by the application.

 Suppose there is a Company object in your application and this object contains a list of employees of the company in a ContactList
 object. There could be thousands of employees in a company. Loading the Company object from the database along with the list of all
 its employees in the ContactList object could be very time consuming. In some cases you don’t even
 require the list of the employees, but you are forced to wait until the company and its list of employees are loaded into the memory.
 One way to save time and memory is to avoid loading of the employee objects until required, and this is done using the Virtual
 Proxy. This technique is also known as Lazy Loading where you are fetching the data only when it is required.

C. Protection Proxy:
 At times, it may be necessary to restrict the accessibility of an object only to a limited set of client objects based on their
 access rights. When a client object tries to access such an object,the client is given access to the services provided by the
 object only if the client can furnish proper authentication credentials. In such cases, a separate object can be designated with
 the responsibility of verifying the access privileges of different client objects when they access the actual object. In other
 words, every client must successfully authenticate with this designated object to get access to the actual object functionality.
 Such an object with which a client needs to authenticate to get access to the actual object can be referred as an object
 authenticator which is implemented using the Protection Proxy.

 Besides the above discussed three main proxies, there are some other kinds of proxies.
 • Cache Proxy/Server Proxy:
  To provide the functionality required to store the results of most frequently used target operations.
 The proxy object stores these results in some kind of a repository. When a client object requests the same operation, the proxy
 returns the operation results from the storage area without actually accessing the target object.
 • Firewall Proxy:
 The primary use of a firewall proxy is to protect target objects from bad clients. A firewall proxy can also be
 used to provide the functionality required to prevent clients from accessing harmful targets.