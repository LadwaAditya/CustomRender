package com.ladwa.aditya.customrender.api;

import com.ladwa.aditya.customrender.ds.Node;

/**
 * An Interface that describes how input must be parsed and rendered
 * Created by Aditya on 15-Apr-17.
 */
public interface Parser {

    /**
     * Recieve an Input to parse data (JSON or XML)
     */
    void getInput();

    /**
     * Create the root node element
     */
    void createParent();

    /**
     * Add childs to root
     * @param node Node represents a View
     */
    void addChilds(Node node);
}
