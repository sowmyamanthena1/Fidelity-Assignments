package com.Project;


class employeedetails {
    int id;
    String name;
    float basicSalary;
    float bonus;
    float netSalary;

    public void displayDetails() {
        System.out.println("Employee Id: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee BasicSalary: " + basicSalary);
        System.out.println("Employee Bonus: " + bonus);
        System.out.println("Employee NetSalary: " + netSalary);
    }
}
class PermanentEmployee extends employeedetails {
    private int pf;
    PermanentEmployee(int id, String name, float basicSalary, int pf) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        this.pf = pf;
        calculateBonus();
        calculateNetSalary();
    }
    private void calculateBonus() {
        if(pf <1000){
            bonus = 0.1f * basicSalary;
        } else if (pf >=1000 && pf<1500) {
            bonus = 0.115f * basicSalary;
        } else if(pf >=1500 && pf<1800) {
            bonus = 0.12f * basicSalary;
        }else{
            bonus = 0.15f * basicSalary;
        }
    }
    private void calculateNetSalary() {
        netSalary = basicSalary - pf;
    }
}
class TemporaryEmployee extends employeedetails{
    int dailywages;
    int noOfDays;
    TemporaryEmployee(int id, String name,int dailywages, int noOfDays) {
        this.id = id;
        this.name = name;
        this.dailywages = dailywages;
        this.noOfDays = noOfDays;
        calculateNetSalary();
        calculateBonus();
    }
    private void calculateNetSalary(){
        netSalary = dailywages * noOfDays;
    }
    private void calculateBonus(){
        if(dailywages < 1000)
        {
            bonus = 0.15f * netSalary;
        } else if (dailywages >= 1000 && dailywages < 1500) {
            bonus = 0.12f * netSalary;
        } else if (dailywages >= 1500 && dailywages < 1750) {
            bonus = 0.11f * netSalary;
        } else {
            bonus = 0.08f * netSalary;
        }
    }
}
public class Employee{
    public static void main(String[] args) {
        PermanentEmployee permanentEmployee = new PermanentEmployee(101,"Ester",25000,1500);
        System.out.println("Permanent Emoloyee Details: ");
        permanentEmployee.displayDetails();
        System.out.println();

        TemporaryEmployee temporaryEmployee = new TemporaryEmployee(102,"Ganesh",1500,20);
        System.out.println("Temporary Emoloyee Details: ");
        temporaryEmployee.displayDetails();
    }
}