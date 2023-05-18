package ru.digitalspirit.map.factories;

public class SquareFactory {

    private static SquareFactory instance;

    public SquareFactory() {
    }

    public static SquareFactory getInstance() {
        if (instance == null) {
            instance = new SquareFactory();
        }
        return instance;
    }
}
