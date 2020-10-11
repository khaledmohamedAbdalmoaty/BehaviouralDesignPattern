package com.basePackage_khaled.ChainOfResponsibility;

public class HttpRequest {
    private String passWord;
    private String userName;

    public HttpRequest(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }



}
