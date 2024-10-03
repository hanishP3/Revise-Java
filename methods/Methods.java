/*
 *  A method is a block of code which only runs when it is called.
    You can pass data, known as parameters, into a method.
    Methods are used to perform certain actions, and they are also known as functions.
 */
package methods;

public class Methods {
    /*
     * Static and Non-Static Methods:
        You can declare a method as static (which means it can be called without creating an instance of the class) or as an instance method (which requires an instance of the class to be called).
        Both types of methods must be defined at the class level.

        myMethod() - is the name of the method
        static - means that the method belongs to the Main class and not an object of the Main class. You will learn more about objects and how to access methods through objects later in this tutorial.
        void - means that this method does not have a return value. You will learn more about return values later in this chapter.
     */
    static void myMethod(){
        System.out.println("This is a method");
    }
    public static void main(String[] args) {
        myMethod();
    }
}



