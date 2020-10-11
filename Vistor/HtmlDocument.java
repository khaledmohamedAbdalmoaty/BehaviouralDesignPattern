package com.basePackage_khaled.Vistor;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {
   // private HtmlNode htmlnode;]
    List<HtmlNode>nodeList=new ArrayList<>();
    public void addNode(HtmlNode node){
        nodeList.add(node);
    }
    public void execute(Operation operation){
        for(HtmlNode node:nodeList){
            node.execute(operation);
        }
    }

}
