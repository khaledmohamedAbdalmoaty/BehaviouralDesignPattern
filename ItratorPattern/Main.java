package com.basePackage_khaled.ItratorPattern;

import java.util.Iterator;

public class Main {
    public static void main(String[] args){
        browserHistoryClass history=new browserHistoryClass();
        history.push("facebook");
        history.push("google");
        history.push("linkedIn");
        history.push("wowgood");
        historyInterface Iterator=history.createIterator();
        while (Iterator.hasNext()){
            System.out.println(Iterator.current());
            Iterator.next();
        }
    }
}
