package com.Assignment2;

class products {
    int product_id;
    String product_name;
    double price;
    public products(int product_id, String product_name, double price) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.price = price;
    }
    public void display() {
        System.out.println("Product ID: " + product_id);
        System.out.println("Product Name: " + product_name);
        System.out.println("Product Price: " + price);
        System.out.println("------------");
    }
}



