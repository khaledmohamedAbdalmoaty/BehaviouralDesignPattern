package com.basePackage_khaled.observer;

public class SpreadSheet implements Observer{
    private DataSource data;
    public SpreadSheet(DataSource data){
        this.data=data;
    }
    @Override
    public void updata() {
        System.out.println("spread sheet got notified"+data.getValue());
    }
}
