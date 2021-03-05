package ru.bounegru.app;

public class Multiplication {

    public static void main(String[] args) {
        resolve();
    }

    private static void resolve() {
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(String.format("%4d", i * j));
            }
            System.out.println();
        }
    }
}
