package com.basePackage_khaled.ItratorPattern;
import java.util.ArrayList;
import java.util.List;

public class browserHistoryClass {
//private List<String> urlList=new ArrayList<>();
private String[]urlList=new String[10];
//private String history;
private int index;
public void push(String url){
   /* urlList.add(url);
    index++;*/
    urlList[index++]=url;
}
public String pop(){
 /*int lastIndex=urlList.size()-1;
 String lastUrl=urlList.get(lastIndex);
 urlList.remove(lastIndex);
 return lastUrl;*/
 return(urlList[--index]);
}
/*public listIterator createIterator(){
    //return new listIterator(this);
    return new  ArrayIterator(this);

}*/
    public ArrayIterator createIterator(){
        //return new listIterator(this);
        return new  ArrayIterator(this);
    }

                    //listIterator
/*public  class listIterator implements historyInterface{
    private browserHistoryClass history;
    private int index;
    public listIterator(browserHistoryClass history){
        this.history=history;
    }
    @Override
    public boolean hasNext() {
        return(index < history.urlList.size());
    }

    @Override
    public String current() {
        return history.urlList.get(index);
    }

    @Override
    public void next() {
        index++;
    }
    public int size(){
        return history.urlList.size();
    }
}*/
                //ArrayIterator
public class ArrayIterator implements historyInterface{
        private browserHistoryClass history;
        private int index;
        private ArrayIterator(browserHistoryClass history){
            this.history=history;
        }
        @Override
        public boolean hasNext() {
            return (index < history.index);
        }

        @Override
        public String current() {
            return history.urlList[index];
        }

        @Override
        public void next() {
            index++;
        }
    }

}
