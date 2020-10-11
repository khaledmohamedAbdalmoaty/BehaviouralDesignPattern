package com.basePackage_khaled.Vistor;

public class AnchoreNode implements HtmlNode{

    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
}
