package com.basePackage_khaled.commandPattern.fx;

import com.basePackage_khaled.commandPattern.fx.fx.Button;

public class Main {
    public static void main (String[]args){
       /* CustomerService service=new CustomerService();
        AddCustomerCommand command=new AddCustomerCommand(service);
        Button button=new Button(command);
        button.click();*/
        ResizeCommand resize=new ResizeCommand();
        BlackAndWhiteCommand blackandwhite=new BlackAndWhiteCommand();
        CompositeCommand composite=new CompositeCommand();
        composite.addCommand(resize);
        composite.addCommand(blackandwhite);
        composite.execute();
        composite.execute();




    }
}
