package com.basePackage_khaled.commandPattern.fx;

import com.basePackage_khaled.commandPattern.fx.fx.Command;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command {
    //private Command command;
    private List<Command>addCommand=new ArrayList<>();
    public void addCommand(Command command){
        addCommand.add(command);
    }

    @Override
    public void execute() {
        for(Command command:addCommand){
            command.execute();
        }


    }
}
