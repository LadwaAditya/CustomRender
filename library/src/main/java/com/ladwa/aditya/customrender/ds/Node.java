package com.ladwa.aditya.customrender.ds;

import java.util.ArrayList;
import java.util.List;

/**
 * A Data structure that holds the view in a tree hierarchy
 * Created by Aditya on 15-Apr-17.
 */
public class Node {
    private List<Node> childs = null;
    private String data;

    public Node(String data) {
        this.childs = new ArrayList<>();
        this.data = data;
    }

    public void add(Node node) {
        childs.add(node);
    }
}
