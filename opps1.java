// Abstract class
abstract class Shape {
    // Abstract method
    public abstract double calculateArea();
    
    // Non-abstract method
    public void display() {
        System.out.println("This is a shape.");
    }
}

// Concrete class extending the abstract class
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing the abstract method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete class extending the abstract class
class oops1 extends Shape {
    private double length;
    private double width;

    public oops1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing the abstract method
    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class opps1 {
    public static void main(String[] args) {
        // Cannot create an instance of an abstract class
        // Shape shape = new Shape(); // This will throw an error
        
        Circle circle = new Circle(5);
        oops1 rectangle = new oops1(4, 6);
        
        circle.display();
        System.out.println("Area of circle: " + circle.calculateArea());
        
        rectangle.display();
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
    }
}
