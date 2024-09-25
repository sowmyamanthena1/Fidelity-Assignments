package com.Assignment2;

public class PersonDetails {
    private String name;
    public int age;
    public String gender;
    public PersonDetails(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public  void displayPersonDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}
