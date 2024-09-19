/*  Control Statements
 * statements that can be used to control the flow of Java code.
 * So there are 3 types
 * 1.decision making
 * 2.loop statements
 * 3.jump statements
 * 
 */

//1.Decision making - if,if-else,if-else-if.
package basics;
import java.util.*;
public class ControlSt{
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        System.out.println("Please enter your age");

         //IF AND ELSE
        int age = user.nextInt();
        if(age<18){
            System.out.println("You are not eligible to vote");
        }else{
            System.out.println("You are eligible to vote");
        }
        user.close();

        //IF ELSE IF
        int score = 67;
        if (score >= 90) {
            System.out.println("You got an A");
        } else if (score >= 80) {
            System.out.println("You got a B");
        } else if (score >= 70) {
            System.out.println("You got a C");
        } else if (score >= 60) {
            System.out.println("You got a D");
        } else {
            System.out.println("You got an F");
        }

        //Switch
        int input = user.nextInt();

        switch (input) {
            case 1:
                    System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;  
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("Enter correct week day");
            
                break;
        }
        

    }
}
