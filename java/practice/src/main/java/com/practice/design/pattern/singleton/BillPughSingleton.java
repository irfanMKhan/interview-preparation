package com.practice.design.pattern.singleton;

public class BillPughSingleton {

    // Private constructor to prevent instantiation
    private BillPughSingleton() {
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    // Static inner class - inner classes are not loaded until they are referenced
    private static class SingletonHelper {
        // Instance is created only when getInstance() is called
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

}