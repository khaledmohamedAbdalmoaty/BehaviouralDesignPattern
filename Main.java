package com.basePackage_khaled;
import com.basePackage_khaled.statePattern.canvise;
import com.basePackage_khaled.statePattern.selectionTool;

public class Main {

    public static void main(String[] args) {
    canvise can=new canvise();
    selectionTool tool=new selectionTool();
    can.setCurrentTool(tool);
    can.mouseDown();

    }

    //implement a function it's type in an interface
    public static CalculatorInterface Getyearcalc(){
        return new Calculator2019();
    }
    public static void draw_what (Trypolymorphism control){
        control.draw();
    }


}



















