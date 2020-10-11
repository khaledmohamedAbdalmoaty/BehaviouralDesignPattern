package com.basePackage_khaled.Vistor;

public class Main {
    public static void main(String[]args){
        AnchoreNode anchoreNode=new AnchoreNode();
        HeadingNode headingNode=new HeadingNode();
        HtmlDocument document=new HtmlDocument();
        document.addNode(headingNode);
        document.addNode(anchoreNode);
        HighlightPlace highlightPlace=new HighlightPlace();
        document.execute(new writeText());




    }
}
