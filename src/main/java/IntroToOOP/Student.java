package IntroToOOP;

public class Student {
    // data members / attributes
    int id;
   public String name;
   protected int age;
   private int salary;

   public int getSalary(){
       return salary;
   }

   public void setSalary(int salary){
       if(salary < 500){
           System.out.println("Sorry, this is an invalid value");
           return;
       }
       this.salary = salary;
   }
    // member functions / behaviour
    void attendClass(){
        System.out.println(name + " is attending class");
    }
}

// getters and setters


// public
// default
// protected
// private
