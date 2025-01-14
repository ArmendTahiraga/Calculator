package com.armendtahiraga;

public class Main {
    public static void main(String[] args) {
        System.out.println(add(2, 3));
        System.out.println(subtract(2, 3));
        System.out.println(multiply(2, 3));
        System.out.println(divide(2, 3));
    }

    public static double add(double x, double y) {
        return x + y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        return x / y;
    }
}