package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        System.out.println("140 rubles are " + Converter.rubleToEuro(140) + " euro.");

        System.out.println("120 rubles are " + Converter.rubleToDollar(120) + " dollars.");
    }
}