package com.swiftfingers.singleton;

/*
* It is just like the ThreadSafeSingleton approach but here
* the synchronized block is used inside the if condition with an additional check to ensure that
* only one instance of a singleton class is created.
* */
public class ThreadSafeSingletonDoubleLocking {

    private static ThreadSafeSingletonDoubleLocking instance;

    private ThreadSafeSingletonDoubleLocking(){}

    public static ThreadSafeSingletonDoubleLocking getInstanceUsingDoubleLocking(){
        if(instance == null){
            synchronized (ThreadSafeSingletonDoubleLocking.class) {
                if(instance == null){
                    instance = new ThreadSafeSingletonDoubleLocking();
                }
            }
        }
        return instance;
    }

}
