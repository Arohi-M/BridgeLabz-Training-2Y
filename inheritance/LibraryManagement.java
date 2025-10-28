// Single Inheritance: Library Management
class Book {
    String title;
    int publicationYear;

    void displayInfo() {
        System.out.println("Title: " + title + ", Year: " + publicationYear);
    }
}

class Author extends Book {
    String name;
    String bio;

    void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + name + ", Bio: " + bio);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Author a = new Author();
        a.title = "Java Essentials";
        a.publicationYear = 2022;
        a.name = "John Doe";
        a.bio = "Expert Java Developer";
        a.displayInfo();
    }
}
