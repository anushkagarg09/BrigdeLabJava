class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void checkResult() {
        if (marks >= 40)
            System.out.println(name + " Passed");
        else
            System.out.println(name + " Failed");
    }

    public static void main(String[] args) {
        Student s1 = new Student("Komal", 55);
        Student s2 = new Student("Raj", 35);

        s1.checkResult();
        s2.checkResult();
    }
}
