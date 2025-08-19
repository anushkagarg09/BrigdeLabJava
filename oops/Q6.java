class Demo {
    // Instance variable
    int value;

    // Constructor
    Demo(int value) {
        // Here 'value' refers to the local variable (parameter)
        // 'this.value' refers to the instance variable
        this.value = value;
    }

    void display() {
        System.out.println("Instance variable value = " + value);
    }

    public static void main(String[] args) {
        // Creating object
        Demo obj1 = new Demo(100);
        Demo obj2 = new Demo(200);

        // Display values
        obj1.display();
        obj2.display();
    }
}
