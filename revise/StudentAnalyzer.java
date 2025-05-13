import java.util.*;

class StudentAnalyzer{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the marks of 3 subjects");
        int mark1 = Integer.parseInt(input.nextLine());
        int mark2 = Integer.parseInt(input.nextLine());
        int mark3 = Integer.parseInt(input.nextLine());
        System.out.println("Total Marks : "+(mark1+mark2+mark3));
        System.out.println("Average Marks : "+(mark1+mark2+mark3)/2);
        String result = (mark1 >= 35 && mark2 >= 35 && mark3 >= 35) ? "Pass" : "Fail";
        System.out.println("Result: " + result);
        
    }
}   