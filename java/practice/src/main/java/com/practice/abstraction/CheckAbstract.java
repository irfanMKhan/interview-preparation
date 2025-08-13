package com.practice.abstraction;

public class CheckAbstract {

    public CheckAbstract() {

    }

    public static void main(String[] args) {
        /*
         cannot initialize
         Abstract class need to be extended.
        */
//        Abstraction abstraction = new Abstraction();

        /*
         Now this works
         */
        Abstraction abstraction = new ExtendedAbstraction();
    }

}
