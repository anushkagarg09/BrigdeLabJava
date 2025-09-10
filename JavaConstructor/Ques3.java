package javaConstructor;


class Pro {
    private String name;
    private double price;
    private String category;

    public Pro(String name, double price) {
        this.name = name;
        this.price = price;
        this.category = "General";
    }

    public Pro(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public Pro() {
        this.name = "Unknown";
        this.price = 0.0;
        this.category = "General";
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Category: " + category);
    }
}

public class Ques3 {
	 public static void main(String[] args) {
		 
	        Pro p1 = new Pro("Phone", 15000.0);
	        Pro p2 = new Pro("TV", 40000.0, "Electronics");
	        Pro p3 = new Pro();
	        p1.display();
	        System.out.println();
	        p2.display();
	        System.out.println();
	        p3.display();
	    }
}

