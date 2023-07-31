package ru.digitalspirit.map.field.Node.model;

public class Edge {
    private Integer id;
    private Integer weight;
    private Polarity polarity;
    private Cell cell;

    public Integer getId() {
        return id;
    }

    public Integer getWeight() {
        return weight;
    }

    public Cell getCell() {
        return cell;
    }
}
