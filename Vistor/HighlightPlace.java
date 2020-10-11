package com.basePackage_khaled.Vistor;

public class HighlightPlace implements Operation {
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("hight light Heading node");
    }
    //
    //
    @Override
    public void apply(AnchoreNode anchore) {
    System.out.println("high light Anchore node");
    }
}
