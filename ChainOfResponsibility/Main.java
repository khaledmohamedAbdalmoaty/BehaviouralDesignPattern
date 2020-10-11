package com.basePackage_khaled.ChainOfResponsibility;

import com.basePackage_khaled.Meditor.ArticleDialogBox;

public class Main {
    public static void main(String []args){
        Compressor compressor=new Compressor(null);
        //logger logger=new logger(compressor);
        Authenticator authenticator=new Authenticator(compressor);
        webServer webServer=new webServer(authenticator);
        webServer.handler(new HttpRequest("admin","1234"));
    }
}
