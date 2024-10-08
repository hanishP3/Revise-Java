//Progarm to take input from user
import java.util.*;
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your age");
        int age = sc.nextInt();
        System.out.println("Your are "+age+ " years old.");
        sc.close();
    }
}
