package com.basePackage_khaled.memotopackage;
import java.util.ArrayList;
import java.util.List;

public class history {
    private List<EditorState> statesList=new ArrayList<>();
    public void push(EditorState item){
        statesList.add(item);
    }
    public EditorState pop(){
        int lastIndex=statesList.size()-1;
        EditorState lastItem=statesList.get(lastIndex);
        statesList.remove(lastIndex);
        return lastItem;
    }
}
