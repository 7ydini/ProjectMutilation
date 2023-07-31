package ru.digitalspirit.map.field;

import ru.digitalspirit.map.field.Node.Node;

import java.util.*;

public abstract class Field {
    private Set<Node> nodes;


    public LinkedList<Node> pathToCell(Node startNode, Node endNode) {
//        TODO
//        Set<Node> unprocessedNode = new HashSet<>();
//        Map<Node, Integer> distanceToNode = new LinkedHashMap<>();


        return new LinkedList<>();
    }

    public Integer distanceToCell(Node startNode, Node endNode) {
        return pathToCell(startNode, endNode).getLast().getDistance();
    }
}
