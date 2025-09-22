package Employee;

//Base class
class Employee {
 String name;
 int id;
 double salary;

 // Constructor
 Employee(String name, int id, double salary) {
     this.name = name;
     this.id = id;
     this.salary = salary;
 }

 // Method to display details
 void displayDetails() {
     System.out.println("Name: " + name);
     System.out.println("ID: " + id);
     System.out.println("Salary: " + salary);
 }
}

//Subclass Manager
class Manager extends Employee {
 int teamSize;

 Manager(String name, int id, double salary, int teamSize) {
     super(name, id, salary); // calling parent constructor
     this.teamSize = teamSize;
 }

 // Override displayDetails
 @Override
 void displayDetails() {
     super.displayDetails(); // call parent method
     System.out.println("Team Size: " + teamSize);
 }
}

//Subclass Developer
class Developer extends Employee {
 String programmingLanguage;

 Developer(String name, int id, double salary, String programmingLanguage) {
     super(name, id, salary);
     this.programmingLanguage = programmingLanguage;
 }

 @Override
 void displayDetails() {
     super.displayDetails();
     System.out.println("Programming Language: " + programmingLanguage);
 }
}

//Subclass Intern
class Intern extends Employee {
 int duration; // in months

 Intern(String name, int id, double salary, int duration) {
     super(name, id, salary);
     this.duration = duration;
 }

 @Override
 void displayDetails() {
     super.displayDetails();
     System.out.println("Internship Duration: " + duration + " months");
 }
}

//Main class to run
public class Management {
 public static void main(String[] args) {
     Manager m = new Manager("Alice", 101, 80000, 5);
     Developer d = new Developer("Bob", 102, 60000, "Java");
     Intern i = new Intern("Charlie", 103, 20000, 6);

     System.out.println("Manager Details:");
     m.displayDetails();

     System.out.println("\nDeveloper Details:");
     d.displayDetails();

     System.out.println("\nIntern Details:");
     i.displayDetails();
 }
}


