class Counter {
    // static variable (shared by all objects)
    static int count = 0;

    // method to modify the static variable
    void increment() {
        count++;
    }

    // method to display value
    void display() {
        System.out.println("Count = " + count);
    }

    public static void main(String[] args) {
        // First object
        Counter obj1 = new Counter();
        obj1.increment();   // modifies static variable
        obj1.display();     // shows updated value

        // Second object
        Counter obj2 = new Counter();
        obj2.display();     // reflects the same change

        // Modifying again using second object
        obj2.increment();
        obj2.display();

        // First object will also see the updated value
        obj1.display();
    }
}
