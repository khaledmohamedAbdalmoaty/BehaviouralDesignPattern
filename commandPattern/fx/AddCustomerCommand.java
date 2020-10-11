package com.basePackage_khaled.commandPattern.fx;
import com.basePackage_khaled.commandPattern.fx.fx.Command;

public class AddCustomerCommand implements Command {
    private CustomerService service;
    public AddCustomerCommand(CustomerService service){
        this.service=service;
    }
    @Override
    public void execute() {
        service.addCustomer();
    }
}
