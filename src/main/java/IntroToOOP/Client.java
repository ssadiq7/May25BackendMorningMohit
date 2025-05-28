package IntroToOOP;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Student student1 = new Student();
        // default is accessible outside the class
        // but within the same package
        student1.id = 1;
        student1.name = "John Doe";
        student1.age = 25;
        // can't access the private outside the class
//        student1.salary = 10000;
        student1.setSalary(1000);
        int sal = student1.getSalary();

        Student student2 = new Student();
        student2.id = 2;
        student2.name = "Jane Dol";
        student2.age = 26;

        System.out.println(student1);
        System.out.println(student1.name);
    }
}

// How it is controlled ? Who can do what ?
// access modifiers