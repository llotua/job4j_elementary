package ru.job4j.converter;

public class Converter {

    public static double rubleToEuro(int value) {
        return Math.round((value / 70d) * 100.0) / 100.0;
    }

    public static double rubleToDollar(int value) {
        return Math.round((value / 60d) * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        System.out.println("140 rubles are " + String.format("%.2f", Converter.rubleToEuro(140)) + " euro.");

        System.out.println("180 rubles are " + String.format("%.2f", Converter.rubleToEuro(180)) + " euro.");

        System.out.println("140 rubles are " + String.format("%.2f", Converter.rubleToDollar(140)) + " dollars.");

        System.out.println("180 rubles are " + String.format("%.2f", Converter.rubleToDollar(180)) + " dollars.");
    }
}