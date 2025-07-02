package com.practice.design.pattern.singleton;

public class Singleton {

    // Step 1: Volatile instance to ensure visibility and prevent instruction reordering
    private static volatile Singleton instance;

    // Step 2: Private constructor to prevent instantiation
    private Singleton() {
        // Optional: protection against reflection
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method");
        }
    }

    // Step 3: Public method with double-checked locking
    public static Singleton getInstance() {
        if (instance == null) { // First check (no locking)
            synchronized (BillPughSingleton.class) {
                if (instance == null) { // Second check (with locking)
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
