package com.basePackage_khaled.commandPattern.fx.htmlEditor;

public class Main {
    public static void main(String[]args){
        HtmlDocument document=new HtmlDocument();
        history history=new history();
        document.setContent("Hello World1");
        document.setContent("Hello World2");
        BoldCommand boldCommand=new BoldCommand(document,history);
        boldCommand.execute();
        System.out.println(document.getContent());
        document.setContent("Hello World2");
        boldCommand.execute();
        document.setContent("Hello World3");
        boldCommand.execute();
        boldCommand.unexecute();
        System.out.println(document.getContent());



    }
}
