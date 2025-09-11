package NestedClasses;

// Demonstration of static nested classes

public class OuterClass2 {
    private static String outerStaticField = "Outer static field";
    private String outerInstanceField = "Outer instance field";

    // Static nested class
    public static class StaticNestedClass {
        private String nestedInstanceField = "Nested instance field";

        public void displayInfo() {
            // Can access static members of the outer class directly
            System.out.println("Accessing outer static field: " + outerStaticField);

            // Cannot directly access non-static members of the outer class
            // System.out.println(outerInstanceField); // This would cause a compile-time error

            // Can access its own instance fields
            System.out.println("Accessing nested instance field: " + nestedInstanceField);
        }

        public static void staticMethodInNestedClass() {
            System.out.println("This is a static method in the static nested class.");
            System.out.println("Can also access outer static field from static method: " + outerStaticField);
        }
    }

    public static void main(String[] args) {

        System.out.println("\nCalling static method of nested class:");
        // Calling static method of nested class without an instance
        OuterClass2.StaticNestedClass.staticMethodInNestedClass();

        // Instantiating the static nested class without an outer class instance
        OuterClass2.StaticNestedClass nestedObject = new OuterClass2.StaticNestedClass();
        nestedObject.displayInfo();
        // Note: Cannot instantiate StaticNestedClass without OuterClass2 prefix
        // StaticNestedClass nestedObject2 = new StaticNestedClass(); // This would cause a compile-time error

    }
}