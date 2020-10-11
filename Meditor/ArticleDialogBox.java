package com.basePackage_khaled.Meditor;

public class ArticleDialogBox  {
  /*  private ListBox listbox=new ListBox(this);//owner:this refer to the Dialog Box in this ArticleDialogBox
    private TextBox textBox=new TextBox(this);
    private Button button=new Button(this);*/
    //
    private ListBox listbox=new ListBox();//owner:this refer to the Dialog Box in this ArticleDialogBox
    private TextBox textBox=new TextBox();
    private Button button=new Button();
    public void ArticleDialogBox(){
        listbox.addObserver(new ObserverMeditor() {
            @Override
            public void update() {
               articleSelected();
            }
        });
        textBox.addObserver(new ObserverMeditor() {
            @Override
            public void update() {
                titleChanged();
            }
        });
    }
    public void simulate(){
        listbox.setSelection("khaled abdlemoaty");
        textBox.setContent("khaled is here");
        listbox.notifyObserver();
        button.notifyObserver();
        System.out.println("textbox:"+textBox.getContent());
        System.out.println("button:"+button.isEnabled());

    }
   /* @Override
    public void changed(UIControl control) {
        if(control==listbox){
            articleSelected();
        }
        else if(control==textBox){
            titleChanged();
        }

    }*/
    private void articleSelected(){
        listbox.setSelection(textBox.getContent());
        button.setEnabled(true);

    }
    private void titleChanged(){
        String content=textBox.getContent();
        boolean isEmpty=(content==null || content.isEmpty());
        button.setEnabled(!isEmpty);


    }
}
