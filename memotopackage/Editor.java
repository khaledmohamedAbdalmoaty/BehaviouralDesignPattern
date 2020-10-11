package com.basePackage_khaled.memotopackage;

public class Editor {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    //create state ->
    public EditorState createState(){
        return new EditorState(content);
    }
    //restore state into this.content
    public void restore(EditorState state){
        this.content=state.getContent();
    }
}
