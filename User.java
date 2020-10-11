package com.basePackage_khaled;

public class User {
     public String name;
     //add a constructor
     public User(String name){
          this.name=name;
     }
    /* public void setName(String name){
          this.name=name;
     };
     public String getName() {
          return this.name;
     };*/
     public void sayHallo(){
          System.out.println("say hello my name is "+this.name);
     }
}
