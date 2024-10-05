/*
 * With method overloading, multiple methods can have the same name with different parameters.
 * Instead of defining two methods that should do the same thing, it is better to overload one.
    In the example below, we overload the myMethod method to work for both int and double.
 */

public class MethodOverload {
    static int myMethod(int  x, int y){
        return x+y;
    }
    static double myMethod(double x, double y){
        return x+y;
    }
    public static void main(String args[]){
        int result1 = myMethod(5, 6);
        double result2 = myMethod(6.6, 7.7);
        System.out.println(result1);
        System.out.println(result2);
    }
}
