package com.basePackage_khaled.commandPattern.fx;

import com.basePackage_khaled.commandPattern.fx.fx.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("resize");
    }
}
