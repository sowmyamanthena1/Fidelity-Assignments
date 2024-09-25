package com.Assignment2;

class AnimalMl_inheri {
    public void eats(){
        System.out.println("Animal eats");
    }
}
class Mammal extends AnimalMl_inheri{
    public void walks(){
        System.out.println("Mammal walks");
    }
}
class Dog extends Mammal{
    public void barks(){
        System.out.println("Dog barks");
    }
}
public  class AnimalMl {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eats();
        dog.walks();
        dog.barks();
    }
}