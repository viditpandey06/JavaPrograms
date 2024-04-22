class Book {
    private String title;
    private Author author; // Assuming Author is a separate class

    public Book(String title, Author author) {
        this.title = title;
        this.author = new Author(author.getName(), author.getEmail()); // Deep copy of Author object
    }

    // Getter methods for title and author

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return new Author(author.getName(), author.getEmail()); // Return a copy of the author object
    }

    // Copy constructor
    public Book(Book other) {
        this.title = other.title;
        this.author = new Author(other.author.getName(), other.author.getEmail()); // Deep copy
    }
}

class Author {
    private String name;
    private String email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getter methods for name and email

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Author author1 = new Author("John Doe", "johndoe@example.com");
        Book book1 = new Book("The Great Gatsby", author1);

        // Create a copy of book1 using the copy constructor
        Book book2 = new Book(book1);

        // Modify the original author object
        author1.setName("Jane Doe");
        author1.setEmail("janedoe@example.com");

        System.out.println("Book 1 title: " + book1.getTitle());
        System.out.println("Book 1 author name: " + book1.getAuthor().getName());
        System.out.println("Book 1 author email: " + book1.getAuthor().getEmail());

        System.out.println("\nBook 2 title: " + book2.getTitle());
        System.out.println("Book 2 author name: " + book2.getAuthor().getName());
        System.out.println("Book 2 author email: " + book2.getAuthor().getEmail());

        // This demonstrates that modifying the original author object doesn't affect
        // the copied book's author information
    }
}
