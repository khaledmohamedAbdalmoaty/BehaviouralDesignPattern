package com.basePackage_khaled.stratgeyPattern;

public class balckAndWhitefilter implements filter {
    @Override
    public void dofilter(String fileName) {
        System.out.println("black and white filer applied on "+fileName);
    }
}
