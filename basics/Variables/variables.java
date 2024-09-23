  /*There are 3 types of varaibles in java
         * 1.Local variables
         * 2.instance variables
         * 3.static variables
         * 
         * Local variable-A varibles defined under a method or constuctor or block is known as local variable
         * Static variable - These variables are declared similarly to instance variables. The difference is that static variables are declared using the static keyword within a class outside of any method, constructor, or block.
         * Instance variables -  non-static variables and are declared in a class outside of any method, constructor, or block
         */

package basics.Variables;
public class variables {

    static String name = "hanish";
    public static void main(String[] args) {
        //LOCAL VARAIBLE
        int num = 89;
        System.out.println(num);
        //Static variable
        System.out.println(name);
        //Instance variable
        int b = 909;
        System.out.println(b);
    }
}
