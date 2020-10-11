package com.basePackage_khaled.stratgeyPattern;

public class Main {
    public static void main(String[]args){
    imageStorage storeImage=new imageStorage();
    storeImage.store("khaled888",new pngComprossor(),new balckAndWhitefilter());
    storeImage.store("khaled888",new jpegComprossor(),new balckAndWhitefilter());


    }
}
