package com.basePackage_khaled.stratgeyPattern;

public class imageStorage {
    /*private comprossor comprossor;
    private filter filter;
    //private filter filter;*/

    public void store(String fileName,comprossor compobj,filter filterobj){
        compobj.compress(fileName);//i want to hide the compress and dofilter method
        filterobj.dofilter(fileName);
    }
}
