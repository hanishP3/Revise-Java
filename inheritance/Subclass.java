package inheritance;

class Superclass {
    int x = 333;  // Instance variable in the superclass

    public void method1() {
        System.out.println("This is superclass and the value of x is " + x);
    }
}

public class Subclass extends Superclass {
    int x = 777;  // Instance variable in the subclass

    @Override
    public void method1() {
        System.out.println("This is subclass and the value of x is " + x);
    }

    public void method2() {
        // Create an instance of Subclass
        Subclass obj1 = new Subclass();

        // Access instance variable x from Subclass and Superclass
        System.out.println("Subclass x: " + obj1.x);  // Subclass x (777)
        System.out.println("Superclass x: " + super.x);  // Superclass x (333)

        // Call the method1() of Subclass and Superclass
        obj1.method1();  // Calls Subclass method1() (prints Subclass x)
        super.method1();  // Calls Superclass method1() (prints Superclass x)
    }

    public static void main(String[] args) {
        // Create an instance of Subclass and call method2
        Subclass obj = new Subclass();
        obj.method2();
    }
}
