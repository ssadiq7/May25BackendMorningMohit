package AbstractClasses;

/*
* A class in Java can extend an abstract class and then subsequently act as a parent class for other classes.
* This is a common pattern in object-oriented programming, allowing for a hierarchy of classes
* where functionality and contracts are progressively defined and implemented.
 */

abstract class AbstractShape {
    abstract double getArea(); // Abstract method
    void displayMessage() {
        System.out.println("This is a shape.");
    }
}

class Circle extends AbstractShape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    // Inherits displayMessage()

    public void displayAbout() {
        System.out.println("class Circle extends AbstractShape");
    }
}

class ColoredCircle extends Circle {
    String color;

    public ColoredCircle(double radius, String color) {
        super(radius); // Call parent constructor
        this.color = color;
    }

    void displayColor() {
        System.out.println("Color: " + color);
    }
}

class Main {
    public static void main(String[] args) {

        // 1. Abstract class cannot be instantiated
        // AbstractShape abstractShape = new AbstractShape(); // This line would cause a compile-time error

        // 2. Abstract class reference can point to a subclass object
        AbstractShape shape = new Circle(3.0);
        System.out.println("Area of Circle: " + shape.getArea());
        shape.displayMessage(); // Inherited from AbstractShape

        // 3. Abstract class reference can point to a subclass object, but only methods defined in the abstract class can be called
        AbstractShape testShape = new ColoredCircle(4.0, "Blue");
        System.out.println("Area of ColoredCircle: " + testShape.getArea());
        testShape.displayMessage(); // Inherited from AbstractShape
        // testShape.displayColor(); // This line would cause a compile-time error, as displayColor() is not defined in AbstractShape
        // testShape.displayAbout(); // This line would cause a compile-time error, as displayAbout() is not defined in AbstractShape

        // 4. Subclass reference can point to a subclass object and call all methods defined in the subclass and its parent classes
        ColoredCircle coloredCircle = new ColoredCircle(5.0, "Red");
        System.out.println("Area: " + coloredCircle.getArea());
        coloredCircle.displayMessage(); // Inherited from AbstractShape
        coloredCircle.displayColor();   // Method from ColoredCircle

        // 5. Subclass reference can point to a parent class object (upcasting)
        Circle circle = new ColoredCircle(6.0, "Green");
        System.out.println("Area: " + circle.getArea());
        circle.displayMessage(); // Inherited from AbstractShape
        // circle.displayColor(); // This line would cause a compile-time error, as displayColor() is not defined in Circle
        circle.displayAbout(); // Method from Circle

    }
}