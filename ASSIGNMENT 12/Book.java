// Superclass: Book
class Book {
    String title;
    int publicationYear;

    // Constructor for Book
    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book details
    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass: Author (extends Book)
class Author extends Book {
    String name;
    String bio;

    // Constructor for Author
    Author(String title, int publicationYear, String name, String bio) {
        // Call the constructor of superclass (Book)
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    // Method to display book and author details
    @Override
    void displayInfo() {
        super.displayInfo(); // Display Book info
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

// Main class to run the program
public class LibraryManagement {
    public static void main(String[] args) {
        // Create an object of Author (which includes Book details)
        Author author1 = new Author("The Alchemist", 1988, "Paulo Coelho", "Brazilian author best known for his novel The Alchemist.");

        // Display full information
        author1.displayInfo();
    }
}
