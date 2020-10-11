package com.basePackage_khaled.statePattern;

public class canvise {
    private Tool currentTool;

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        //note:Tool we will have a new object from main program to either selectionTool or any tool
        this.currentTool = currentTool;
    }
    public void mouseUp(){
    currentTool.mouseUp();
    }
    public void mouseDown(){
    currentTool.mouseDown();
    }

}
