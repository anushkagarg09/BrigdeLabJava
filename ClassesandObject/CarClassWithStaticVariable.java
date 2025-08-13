class Car {
    String brand;
    int speed;
    static int wheels = 4;

    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + ", Wheels: " + wheels);
    }

    public static void main(String[] args) {
        Car c1 = new Car("BMW", 200);
        Car c2 = new Car("Audi", 180);
        Car c3 = new Car("Tesla", 220);

        c1.display();
        c2.display();
        c3.display();

        System.out.println("\nChanging wheels using c1...");
        c1.wheels = 6;

        c1.display();
        c2.display();
        c3.display(); // Shows wheels changed for all
    }
}
