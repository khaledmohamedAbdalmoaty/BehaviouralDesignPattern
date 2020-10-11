package com.basePackage_khaled.Meditor;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public abstract class UIControl {
    //pointer refer to something of kind DialogB
  /*  protected DiglogBox owner;

    public UIControl(DiglogBox owner) {
        this.owner=owner;
    }*/
    private List<ObserverMeditor> observerList=new ArrayList<>();
    public void addObserver(ObserverMeditor observer){
        observerList.add(observer);
    }
    protected void notifyObserver(){
        for(ObserverMeditor observer:observerList){
            observer.update();
        }
    }
}
