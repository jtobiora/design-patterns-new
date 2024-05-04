package com.swiftfingers.singleton;

import java.io.Serializable;

/*
* One of the ways to create an object is to use clone method. Another is to deserialize a serialized object.
* When we apply these two on a Singleton class, another instance or copy of the class is created.
* The remedy is to implement the Cloneable interface and override the clone() method. The second is to
* implement the Serializable interface and provide the implementation of readResolve() method.
* This is what we have done below
* */
public class ClonedSerializedSingleton implements Cloneable,Serializable{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new CloneNotSupportedException();
    }
    protected Object readResolve() {
        return createInstance();
    }

    /*
	 * As private constructor is used so can not create object of this class
	 * directly. Except by using static method of same class.
	 */
    private  ClonedSerializedSingleton() {
    }

    /*
     * Here static inner class is used instead of Static variable. It means
     * Object will be lazy initialized.
     */
    private static class LazyInit {
        private static final ClonedSerializedSingleton instance = new ClonedSerializedSingleton();
    }

    /*
     * Whenever object ClonedSerializedSingleton is required this method will be invoked and it will
     * return the instance of ClonedSerializedSingleton.
     */
    public static ClonedSerializedSingleton createInstance() {
        return LazyInit.instance;
    }

}
