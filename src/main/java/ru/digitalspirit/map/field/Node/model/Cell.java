package ru.digitalspirit.map.field.Node.model;

import ru.digitalspirit.map.field.Node.Node;
import ru.digitalspirit.character.Character;

import java.util.*;

public class Cell extends Node {
    private static final Integer MAX_EDGES = 4;
    private LinkedHashSet<Edge> edges;


    public Cell(Integer id, LinkedHashSet<Edge> edges, Boolean occupied, Character unit) {
        this.id = id;
        this.edges = edges;
        this.occupied = occupied;
        this.unit = unit;
    }
}
