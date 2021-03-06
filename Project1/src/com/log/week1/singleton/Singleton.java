package com.log.week1.singleton;

public class Singleton {

    private static Singleton instance = null;
 
    public String foo;

    private Singleton() {
        foo = "Some variable";
    }

    public static Singleton getInstance() {
        if (instance == null){
            instance = new Singleton();
        }

        return instance;
    }

}
