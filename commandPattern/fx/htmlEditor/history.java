package com.basePackage_khaled.commandPattern.fx.htmlEditor;

import java.util.ArrayDeque;
import java.util.Deque;

public class history {
    private Deque<HtmlUndoCommand> addHtmlUndocommand=new ArrayDeque<>();
    public void push(HtmlUndoCommand command){
        addHtmlUndocommand.add(command);
    }
    public void pop(){
        addHtmlUndocommand.pop();
    }
}
