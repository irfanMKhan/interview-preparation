package com.practice;

import com.practice.abstraction.Abstraction;
import com.practice.design.pattern.singleton.BillPughSingleton;
import com.practice.design.pattern.singleton.Singleton;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticeApplication.class, args);

        Abstraction abstraction = new Abstraction() {
            @Override
            public void work() {

            }
        };

        abstraction.print();

        // Checking if it gives the same object
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());

        // Checking if it gives the same object
        System.out.println(BillPughSingleton.getInstance());
        System.out.println(BillPughSingleton.getInstance());
    }

}
