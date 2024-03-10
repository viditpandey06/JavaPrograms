import java.io.FileReader;
import java.io.IOException;

public public class ErrorHandlingExample {

    public static void main(String[] args) {
        try {
            // Code that might throw an exception
            divideByZero();
            openNonexistentFile(); // Example of a checked exception
            String name = null;
            System.out.println(name.toUpperCase()); // NullPointerException
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (IOException e) {
            System.out.println("Error: Could not open file.");
        } catch (NullPointerException e) {
            System.out.println("Error: Cannot access a method of null object.");
        } finally {
            // Code that always executes, regardless of exceptions
            System.out.println("This code always executes.");
        }

        System.out.println("Program continues after handling exceptions.");
    }

    public static void divideByZero() {
        int result = 10 / 0; // Throws ArithmeticException
        System.out.println(result);
    }

    public static void openNonexistentFile() throws IOException {
        FileReader reader = new FileReader("nonexistent.txt"); // Throws IOException (checked exception)
    }
}{

}
