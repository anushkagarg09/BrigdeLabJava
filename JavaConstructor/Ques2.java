package javaConstructor;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
    }
}

public class Ques2 {
	  public static void main(String[] args) {
	        Product p = new Product("Laptop", 75000.0);
	        p.display();
	    }
}

