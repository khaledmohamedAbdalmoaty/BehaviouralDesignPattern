package com.basePackage_khaled.ChainOfResponsibility;

public class Authenticator extends Handler {
    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    protected boolean doHandle(HttpRequest request) {
        System.out.println("Authentication is being doing...");
        if(request.getUserName()=="admin" && request.getPassWord()=="1234"){
            System.out.println("Authentication Ok");
            return true;
        }
        else{
            System.out.println("Authentication Not Ok");
            return false;
        }
    }
}
