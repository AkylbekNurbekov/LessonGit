package com.company;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person(20, "Akylbek");
        Person person2 = new Person(21, "Talgarbek");
        Person person3 = new Person(20, "Aman");
        Person person4 = new Person(21, "Aktan");

        Person[] persons = {person1, person2, person3, person4};

        for (Person a : persons) {
            System.out.println(a);

        }
    }
}
