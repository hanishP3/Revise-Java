package basics;

public class Operators {
    public static void main(String[] args) {
        int a = 5;
        int b = 20;
        int c = 8;
        boolean d = true;
        boolean e = false;
        System.out.println("Arithmatic operator");
        System.out.println("a+b- "+(a+b));
        System.out.println("a-b- "+(a-b));
        System.out.println("a*b- "+(a*b));
        System.out.println("a/b- "+(a/b));
        System.out.println("a%b- "+(a%b));
       
        System.out.println("Uniary operator");
        System.out.println("Post increment a++ -" + (a++));
        System.out.println("Pre increment ++a -" + (++a));             //Here  a is incremented by 1 so ++a returns 7 instead of 6.
        System.out.println("Pre increment ++b " + (++b));

        System.out.println("Assignment operator");
        System.out.println("a+=3 - " + (a=a+3));          //The value of a is 7. We got 7 from above operations.Output is 10 
        System.out.println("a-=3 - " + (a=a-3));
        System.out.println("SAME APPLIES TO OTHER OPERATORS");

        System.out.println("Relational operator");
        System.out.println("a > b- " + (a > b));
        System.out.println("a < b- " + (a < b));
        System.out.println("a >= b- " + (a >= b));
        System.out.println("a <= b- " + (a <= b));
        System.out.println("a == c- " + (a == c));
        System.out.println("a != c- " + (a != c));

        System.out.println("Logical operators");
        System.out.println("d&&e- "+ (d && e));
        System.out.println("d||e- " + (d || e));
        System.out.println("!d- " + (!d));

        System.out.println("Ternary operator");
        String crt = "correct";
        String wrng = "Wrong";
        String result = a>b ? crt : wrng ;
        System.out.println(result);

        System.out.println("Bitwise operator");
        //the bitwise operator handles the operation in the bit level
        System.out.println("a & b: " + (a & b));
        System.out.println("a | b: " + (a | b));
        System.out.println("a ^ b: " + (a ^ b));
       

    }
}
