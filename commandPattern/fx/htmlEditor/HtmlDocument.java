package com.basePackage_khaled.commandPattern.fx.htmlEditor;

public class HtmlDocument {
    private String content;
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public void makeBold(){
        content="<b>"+content+"<b>";
    }



}
