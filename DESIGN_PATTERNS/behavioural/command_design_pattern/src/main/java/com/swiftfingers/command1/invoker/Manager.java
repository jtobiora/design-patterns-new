package com.swiftfingers.command1.invoker;

//Invoker
public class Manager extends Invoker {

    @Override
    public void invokeCommand() {
        this.getCommand().execute();
    }

    public void validateOrder() {
        invokeCommand();
    }
}