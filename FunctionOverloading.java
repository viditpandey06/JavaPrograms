public class FunctionOverloading {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to concatenate two strings
    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    // Method to concatenate three strings
    public String concatenate(String str1, String str2, String str3) {
        return str1 + str2 + str3;
    }

    public static void main(String[] args) {
        FunctionOverloading functions = new FunctionOverloading();

        // Overloaded addition methods
        System.out.println("Adding two numbers: " + functions.add(5, 10));
        System.out.println("Adding three numbers: " + functions.add(3, 7, 11));

        // Overloaded concatenation methods
        System.out.println("Concatenating two strings: " + functions.concatenate("Hello, ", "World!"));
        System.out.println("Concatenating three strings: " + functions.concatenate("This ", "is ", "Java."));
    }
}
