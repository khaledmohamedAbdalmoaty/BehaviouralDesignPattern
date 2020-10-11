package com.basePackage_khaled.commandPattern.fx.htmlEditor;

public class Undo implements HtmlCommand {
    private history history;
    private Undo(history history){
        this.history=history;
    }
    @Override
    public void execute() {
        history.pop();
    }
}
