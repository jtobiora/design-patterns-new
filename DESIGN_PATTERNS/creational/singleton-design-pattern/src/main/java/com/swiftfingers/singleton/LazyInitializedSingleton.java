package com.swiftfingers.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
* Lazy initialization method to implement Singleton pattern creates the instance in the global access method.
* Here is the sample code for creating Singleton class with this approach.
* This implementation works fine in case of the single-threaded environment but when it comes to
* multithreaded systems, it can cause issues if multiple threads are inside the if condition at the same time.
 * It will destroy the singleton pattern and both threads will get the different instances of the singleton class
* */
public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton(){
        //prevent using Reflection to instantiate object
        if (instance != null)
            throw new RuntimeException("Instance has already been initialized!");
    }

    public static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        System.out.println("Hashcode of Singleton Object: "+ instance.hashCode());
        return instance;
    }
}
