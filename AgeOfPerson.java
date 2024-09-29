package com.Assignment3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


class Person{
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getAdult(){
        int age = getAge(dateOfBirth);
        if(age >= 18){
            return "Adult";
        } else {
            return "Child";
        }
    }
    public int getAge(LocalDate dateOfBirth){
        LocalDate currentDate = LocalDate.now();
        return Period.between(dateOfBirth, currentDate).getYears();
    }
    public void DisplayDetails(){
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + getAge(dateOfBirth));
        System.out.println(getAdult());
    }
}
public class AgeOfPerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person = new Person();
        System.out.println("Enter First Name: ");
        person.setFirstName(sc.next());
        System.out.println("Enter Last Name: ");
        person.setLastName(sc.next());
        System.out.println("Enter date of birth in yyyy/MM/dd format: ");
        String dobInput = sc.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate dob = LocalDate.parse(dobInput, formatter);
        person.setDateOfBirth(dob);
        person.DisplayDetails();
        sc.close();
    }
}
