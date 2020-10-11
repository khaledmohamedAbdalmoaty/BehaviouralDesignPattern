package com.basePackage_khaled.ChainOfResponsibility;

public class webServer {
    private Handler handler;

    public webServer(Handler handler) {
        this.handler = handler;
    }

    public void handler(HttpRequest request){
            handler.handle(request);
     }
}
