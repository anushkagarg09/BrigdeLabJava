package javaConstructor;

class Customer {
    private String customerName;

    public Customer(String customerName) {
        this.customerName = customerName; 
    }

    public void display() {
        System.out.println("Customer Name: " + customerName);
    }
}

public class Ques1 {
	public static void main(String[] args) {
        Customer c = new Customer("Anushka");
        c.display();
    }

}

