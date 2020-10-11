package com.basePackage_khaled.ChainOfResponsibility;

public abstract class Handler {
    private Handler next;

    public Handler(Handler next) {
        this.next = next;
    }
    public void handle(HttpRequest request){
        if(doHandle(request)==false){
            return;
        }
        if(next!=null){
            next.handle(request);
        }
    }
    protected abstract boolean doHandle(HttpRequest request);
}
