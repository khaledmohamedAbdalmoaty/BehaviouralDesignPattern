package com.basePackage_khaled.commandPattern.fx;

import com.basePackage_khaled.commandPattern.fx.fx.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("black and white command");
    }
}
