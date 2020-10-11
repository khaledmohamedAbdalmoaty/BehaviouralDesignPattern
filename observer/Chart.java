package com.basePackage_khaled.observer;

public class Chart implements Observer{
    private DataSource data;
    public Chart(DataSource data){
        this.data=data;
    }
    @Override
    public void updata() {
        System.out.println("chart updated"+data.getValue());
    }
}
