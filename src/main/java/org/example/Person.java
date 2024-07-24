package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    double height;
    double weight;
    String status;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, double height){
        this(firstName, lastName, age);
        this.height = height;
    }

    public Person(String firstName, String lastName, int age, double height, double weight){
        this(firstName, lastName, age, height);
        this.weight = weight;
    }

    public Person(String firstName, String lastName, int age, double height, double weight, String status){
        this(firstName, lastName, age, height, weight);
        this.status = status;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 & age < 19 ;
    }
}
