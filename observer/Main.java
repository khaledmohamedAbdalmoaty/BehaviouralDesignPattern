package com.basePackage_khaled.observer;

public class Main {
    public static void main(String args[]){
        DataSource dataSource=new DataSource();
        dataSource.setValue(1);
        SpreadSheet spreadSheet=new SpreadSheet(dataSource);
            Chart chart=new Chart(dataSource);
            dataSource.addObserver(chart);
            dataSource.addObserver(spreadSheet);
            dataSource.notifyObserver();
            //subject.notifyObserver();

    }
}
