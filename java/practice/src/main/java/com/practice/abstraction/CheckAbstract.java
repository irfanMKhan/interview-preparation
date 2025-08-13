package com.practice.abstraction;

public class CheckAbstract {

    public CheckAbstract() {

    }

    public static void main(String[] args) {
        /*
        cannot initialize
        abstract class need to be extended.
        */
//        Abstraction abstraction = new Abstraction();

        /*
        now this works
         */
        Abstraction abstraction = new ExtendedAbstraction();
    }

}
