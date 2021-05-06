package ru.job4j;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Multiple {

    public static void main(String[] args) {
        IntStream.range(2, 10).forEach(i -> System.out.println(1 + " * " + i + " = " + 1 * i));
        char sex = 6;
    }
}