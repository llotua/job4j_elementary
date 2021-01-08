package ru.job4j.calculator;

import java.util.Arrays;

public class ArgMethod {

    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;

        ArgMethod.hello(name);

        ArgMethod.hello(name, age);

        ArgMethod.hello(age);

        Arrays.asList(name, name, name).forEach(ArgMethod::hello);
    }

    private static void hello(int age) {
        System.out.println(age + " is old");
    }

    private static void hello(String name, int age) {
        System.out.println("Hello, " + name + " " + age + " is old");
    }
}