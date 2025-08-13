package com.practice.abstraction;

public abstract class Abstraction {

    /*
    Abstract class have constructor
    but abstract class can not be initialized
     */
    public Abstraction() {

    }

    public abstract void work();


    public void print() {
        System.out.println("In: " + this.getClass().getName());
    }

}

