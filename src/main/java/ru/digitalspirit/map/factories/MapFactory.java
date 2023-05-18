package ru.digitalspirit.map.factories;

public class MapFactory {
    private static MapFactory instance = null;

    public MapFactory() {
    }

    public static MapFactory getInstance() {
        if (instance == null) {
            instance = new MapFactory();
        }
        return instance;
    }
}
