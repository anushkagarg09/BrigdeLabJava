class Student {
    // Attributes
    String name;
    int marks;

    // Constructor to initialize values
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Method to display student data
    void display() {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }

    // Main method
    public static void main(String[] args) {
        // Creating two objects of Student
        Student s1 = new Student("Anushka", 90);
        Student s2 = new Student("Rahul", 85);

        // Printing their data
        s1.display();
        s2.display();
    }
}

