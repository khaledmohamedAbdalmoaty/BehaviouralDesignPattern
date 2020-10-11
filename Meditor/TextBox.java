package com.basePackage_khaled.Meditor;

public class TextBox extends UIControl{
    private String content;
/*

    public TextBox(DiglogBox owner) {
        super(owner);
    }
*/

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        /*owner.changed(this);*/
        notifyObserver();
    }
}
