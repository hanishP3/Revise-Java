/* 
Strings are the type of objects that can store the character of values and in Java, every character is      stored in 16 bits.A string acts the same as an array of characters in Java
String name = "Hanish";
Two ways to create string 
1.String literal
2.Using new keyword
*/

package strings;

public class Strings {
    public static void main(String[] args) {
        System.out.println("Create String using String literal");
        String name = "hanish";
        System.out.println(name);
        System.out.println("Create String using new keyword");
        String str1 = new String("this is created by using new keyword");
        // JVM will create a new string object in normal (non-pool) heap memory and the literal “str1” will be placed in the string constant pool. The variable s will refer to the object in the heap (non-pool)//
        System.out.println(str1);

        
}
}
