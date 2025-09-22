// Superclass Book
class Book {
    String title;
    int publicationYear;

    // Constructor
    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass Author extends Book
class Author extends Book {
    String name;
    String bio;

    // Constructor
    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // call Book constructor
        this.name = name;
        this.bio = bio;
    }

    // Override displayInfo
    @Override
    void displayInfo() {
        super.displayInfo(); // call parent method
        System.out.println("Author Name: " + name);
        System.out.println("Bio: " + bio);
    }
}

// Main class
public class Management {
    public static void main(String[] args) {
        Author a = new Author("The Great Adventure", 2022, "John Smith", "A famous novelist known for thrillers.");
        
        a.displayInfo(); // show details of book and author
    }
}
