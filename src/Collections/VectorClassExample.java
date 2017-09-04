package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorClassExample {

    public static void main(String[] args) {
        //Creating list of Books
        List<ComputerBook> list = new ArrayList<ComputerBook>();
        //Creating Books
        Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);

        Vector book = new Vector();
        book.add(b1);
        book.add(b2);
        book.add(b3);
        System.out.println(book);
    }
}

class ComputerBook {
    int id;
    String name, author, publisher;
    int quantity;

    public ComputerBook(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    public String toString() {

        String result = "";
        result += "\nid:" + id + "\nname:" + name + "\nauthor:" + author + "\npublisher:" + publisher + "\nquantity:" + quantity + " ";
        return result;

    }
}

