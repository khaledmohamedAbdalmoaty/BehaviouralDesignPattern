package com.basePackage_khaled.Meditor;

public class ListBox extends UIControl {
    private String selection ;

  /*  public ListBox(DiglogBox owner) {
        super(owner);
    }*/

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
        notifyObserver();
    }
}
