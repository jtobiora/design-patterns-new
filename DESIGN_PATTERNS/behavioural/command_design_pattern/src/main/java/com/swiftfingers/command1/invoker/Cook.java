package com.swiftfingers.command1.invoker;

//Invoker
public class Cook extends Invoker {

    @Override
    public void invokeCommand() {
        this.getCommand().execute();
    }

    public void prepareOrder() {
        invokeCommand();
    }
}