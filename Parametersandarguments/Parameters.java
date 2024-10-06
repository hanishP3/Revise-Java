/*
*   Information can be passed to methods as a parameter. Parameters act as variables inside the method.
    Parameters are specified after the method name, inside the parentheses. You can add as many parameters as you want, just separate them with a comma.

    from below String  name , int age are parameters.
                hanish,21 and others are called arguments.
 */
package Parametersandarguments;
public class Parameters {
    static void myMethod(String name,int age){
        System.out.println("hi " +name+ " your age is " +age);
    }
    public static void main(String[] args){
        myMethod("hanish",21);
        myMethod("leo",21);
        myMethod("peter parker",21);
    }
}
