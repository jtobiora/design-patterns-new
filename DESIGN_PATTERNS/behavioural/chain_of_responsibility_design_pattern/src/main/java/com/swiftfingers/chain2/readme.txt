                                 CHAIN OF RESPONSIBILITY DESIGN PATTERN
What the Chain of Responsibility pattern states is – decouple the client who sends the request to the object that
handles it. The solution is a list of handler objects, also known as responding objects each capable to deal with a
specific nature of request. If one handler object can’t handle a request, it passes it to the next object in the chain.
At the end of the chain, there will be one or more generic handler objects implementing default behavior for the request.

You can relate the Chain of Responsibility pattern with a Customer Service technical help desk that you call up with a
technical query/help for some product or service (think yourself as a request object). A technical help desk executive
tries to resolve it (Think in terms of objects – the first object in the chain). If they can’t resolve it – maybe for
some billing related issues, it moves to a billing help desk executive (the second object). If the billing help desk
can’t resolve either, your request goes to the general help desk (the third object), and so on – until someone handles
your request.

1. Handler (AbstractSupportHandler) Abstract base class acting as the interface to handle request. Optionally, but most
  often the Handler implements the chain links.
2. ConcreteHandler (TechnicalSupportHandler, BillingSupportHandler, and GeneralSupportHandler.) Handles request, else
passes it to the next successor of the handler chain.
3. Client(RequestorClient): Initiates a request that one of the chain of handlers ( a ConcreteHandler) handles