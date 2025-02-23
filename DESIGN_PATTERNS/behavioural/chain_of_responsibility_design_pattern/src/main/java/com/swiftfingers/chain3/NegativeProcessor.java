package com.swiftfingers.chain3;

public class NegativeProcessor implements Chain{

    private Chain nextInChain;

    @Override
    public void setNext(Chain nextInChain) {
        this.nextInChain = nextInChain;
    }

    @Override
    public void process(Number request) {
        if(request.getNumber() < 0){
            System.out.println("NegativeProcessor " + request.getNumber());
        }else {
            this.nextInChain.process(request);
        }
    }
}
