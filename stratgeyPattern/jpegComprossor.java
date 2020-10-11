package com.basePackage_khaled.stratgeyPattern;

public class jpegComprossor implements comprossor{
    @Override
    public void compress(String fileName) {
        System.out.println(fileName+"is compressed with jpeg comprossor algorithms");
        //System.out.println("jpeg comprossor");
    }
}
