package com.swiftfingers.chain2;

public class RequestorClientTest {
    public static void main(String[] args) {
        AbstractSupportHandler handler=RequestorClient.getHandlerChain();
        handler.receiveRequest(AbstractSupportHandler.TECHNICAL, " I'm having problem with my internet connectivity.");
        System.out.println("............................................");
        handler.receiveRequest(AbstractSupportHandler.BILLING, "Please resend my bill of this month.");
        System.out.println("............................................");
        handler.receiveRequest(AbstractSupportHandler.GENERAL, "Please send any other plans for home users.");
    }
}
