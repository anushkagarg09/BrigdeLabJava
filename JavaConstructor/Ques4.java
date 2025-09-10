package javaConstructor;

class P {
    private String name;
    private double price;
    private double discountedPrice;

    public  P(String name, double price) {
        this.name = name;
        this.price = price;
        this.discountedPrice = calculatePrice(price); 
    }

    private double calculatePrice(double originalPrice) {
        return originalPrice * 0.9;
    }

    public void display() {
        System.out.println("Product Name: " + name);
        System.out.println("Original Price: " + price);
        System.out.println("Discounted Price: " + discountedPrice);
    }
}

public class Ques4 {
    public static void main(String[] args) {
        P p1 = new P(null, 0);
        p1.display();
    }
}

