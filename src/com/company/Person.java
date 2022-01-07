package com.company;

public class Person {
    int age ;
    String name ;

    public Person (int age, String name){
        this.age = age;
        this. name = name;
    }

    public Person(){

    }

    public void setAge(int age){
        this.age = age;

    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "Person: " + "age= " + age + "name= " + name ;
    }
}
