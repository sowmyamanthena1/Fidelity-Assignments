package com.Assignment2;
public class MainProduct {
    public static void main(String[] args) {
        products[] products = new products[5];
        products[0] = new products(1, "apple",50.6);
        products[1] = new products(2, "banana",70.2);
        products[2] = new products(3, "orange",80.6);
        products[3] = new products(4, "watermelon",90.6);
        products[4] = new products(5, "apple",50.6);

        products[0].display();
        products[1].display();
        products[2].display();
        products[3].display();
        products[4].display();
    }
}

