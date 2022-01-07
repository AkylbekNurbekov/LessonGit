package com.company;

public class Main {

    public static void main(String[] args) {
        Person person  = new Person();
        person.setAge(20);
        person.setName("Akylbek");

        System.out.println(person.getAge()+" "+person.getName());
    }
}
