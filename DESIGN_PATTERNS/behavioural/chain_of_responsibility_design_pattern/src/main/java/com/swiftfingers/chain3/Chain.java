package com.swiftfingers.chain3;

public interface Chain {
    void setNext(Chain nextInChain);
    void process(Number request);
}
