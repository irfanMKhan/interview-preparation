package com.practice.abstraction;

public class ExtendedAbstraction extends Abstraction {

    public ExtendedAbstraction() {
        super();
    }

    /*
    abstract method needs to be implemented.
     */
    @Override
    public void work() {
        System.out.println("Practice is working...");
    }

}
