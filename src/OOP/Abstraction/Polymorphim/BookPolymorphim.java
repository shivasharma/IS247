package OOP.Abstraction.Polymorphim;

// Book class (Parent class)
class Book {
    // Properties
    String title;
    String author;

    // Constructor to initialize title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }

    // Polymorphic method: printSummary
    void printSummary() {
        System.out.println("This is a book titled '" + title + "' by " + author + ".");
    }
}

// EBook class (Child class inheriting from Book)
class EBook extends Book {
    // Additional property
    double fileSize; // in MB

    // Constructor to initialize title, author, and fileSize
    public EBook(String title, String author, double fileSize) {
        super(title, author); // Call the parent class constructor
        this.fileSize = fileSize;
    }

    // Method to display eBook details (overrides the parent class method)
    @Override
    void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", File Size: " + fileSize + " MB");
    }

    // Override the polymorphic method: printSummary
    @Override
    void printSummary() {
        System.out.println("This is an eBook titled '" + title + "' by " + author + " with a file size of " + fileSize + " MB.");
    }
}

// Main class to test the Book and EBook classes
class Main {
    public static void main(String[] args) {
        // Create a Book object
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        System.out.println("Book Details:");
        book.displayDetails();
        book.printSummary(); // Calls the Book class's printSummary method

        // Create an EBook object
        EBook ebook = new EBook("Clean Code", "Robert C. Martin", 5.2);
        System.out.println("\nEBook Details:");
        ebook.displayDetails();
        ebook.printSummary(); // Calls the EBook class's printSummary method

        // Polymorphism in action
        System.out.println("\nPolymorphism Example:");
        Book polymorphicBook = new EBook("1984", "George Orwell", 3.8);
        polymorphicBook.printSummary(); // Calls the EBook class's printSummary method
    }
}
