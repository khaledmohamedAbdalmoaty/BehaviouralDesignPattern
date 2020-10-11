package com.basePackage_khaled.commandPattern.fx.htmlEditor;

public class BoldCommand implements HtmlUndoCommand {
    private String prevContent;
    private HtmlDocument document;
    private history history;
    public BoldCommand(HtmlDocument document, history history) {
        this.document = document;
        this.history = history;
    }

    @Override
    public void unexecute() {
        document.setContent(prevContent);
        
    }

    @Override
    public void execute() {
        prevContent=document.getContent();
        document.makeBold();
        history.push(this);
    }
}
