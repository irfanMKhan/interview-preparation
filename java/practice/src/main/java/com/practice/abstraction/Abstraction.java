package com.practice.abstraction;

public abstract class Abstraction {

    public abstract void work();

    public void print() {
        System.out.println("In: " + this.getClass().getName());
    }

}

