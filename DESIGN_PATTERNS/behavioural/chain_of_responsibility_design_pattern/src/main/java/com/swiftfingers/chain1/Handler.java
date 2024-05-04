package com.swiftfingers.chain1;


public interface Handler {
    //The setHandler is used to set the next handler in the chain
    public void setHandler(Handler handler);

    //Used to process the request, only if the handler can able process the request
    public void process(File file);
    public String getHandlerName();
}