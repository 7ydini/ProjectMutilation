package ru.digitalspirit.map.field.Node;

import ru.digitalspirit.map.field.Node.model.Edge;
import ru.digitalspirit.unit.Unit;

import java.util.Map;

public abstract class Node {
    protected Integer id;
    protected Integer distance;
    protected Map<Node, Edge> parents;
    protected Unit unit;
    protected Boolean occupied;

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }
}
