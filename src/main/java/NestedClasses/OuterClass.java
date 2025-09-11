package NestedClasses;

// Demonstration of non-static nested classes

class OuterClass {
    int outerX = 10;

    class InnerClass {
        void display() {
            System.out.println("Value of outerX from InnerClass: " + outerX);
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display(); // Output: Value of outerX from InnerClass: 10

        // InnerClass inner2 = new InnerClass(); // This would cause a compilation error
        // because InnerClass is not static and needs an instance of OuterClass to be instantiated.
    }
}