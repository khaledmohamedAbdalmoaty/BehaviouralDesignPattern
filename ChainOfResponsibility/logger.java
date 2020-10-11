package com.basePackage_khaled.ChainOfResponsibility;

public class logger extends Handler{
    public logger(Handler next) {
        super(next);
    }



    @Override
    protected boolean doHandle(HttpRequest request) {
        System.out.println("logedIn");
        return true;
    }
}
