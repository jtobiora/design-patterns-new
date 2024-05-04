package com.swiftfingers.demo;

import com.swiftfingers.singleton.ClonedSerializedSingleton;
import com.swiftfingers.singleton.EagerInitializedSingleton;
import com.swiftfingers.singleton.SerializedSingleton;

import java.io.*;
import java.lang.reflect.Constructor;

public class SingletonDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        ////creating more than one instance of a class using Reflection
//        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
//        EagerInitializedSingleton instanceTwo = null;
//        try {
//            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
//            for (Constructor constructor : constructors) {
//                //Below code will destroy the singleton pattern
//                constructor.setAccessible(true);
//                instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
//                break;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println(instanceOne.hashCode());
//        System.out.println(instanceTwo.hashCode());



        ////Cloned and Serialize Singleton demo
//        ClonedSerializedSingleton instanceOne = ClonedSerializedSingleton.createInstance();
//        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
//                "filename.ser"));
//        out.writeObject(instanceOne);
//        out.close();
//
//        //deserailize from file to object
//        ObjectInput in = new ObjectInputStream(new FileInputStream(
//                "filename.ser"));
//        ClonedSerializedSingleton instanceTwo = (ClonedSerializedSingleton) in.readObject();
//        in.close();
//
//        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
//        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());

    }
}
