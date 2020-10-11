package com.basePackage_khaled.Vistor;

public class writeText implements Operation{
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("writing headingNode");
    }

    @Override
    public void apply(AnchoreNode anchore) {
        System.out.println("writing AnchorNode");

    }
}
