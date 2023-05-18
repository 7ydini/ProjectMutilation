package ru.digitalspirit.map.factories;

public class FieldFactory {
    public static FieldFactory instance = null;

    public FieldFactory() {

    }

    public static FieldFactory getInstance() {
        if (instance == null) {
            instance = new FieldFactory();
        }
        return instance;
    }
}
