/*  Methods to Take Input in Java
    There are two ways by which we can take Java input from the user or from a file
    1.BufferedReader Class
    2.Scanner Class
 * 
 */
package basics.InputOutput;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    //BufferdReader class 

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        // Create a BufferedReader to take input from the console
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String name = reader.readLine();  // Read a line of text

        System.out.println("Hello, " + name + "!");
    }
}
//Scanner class
// import java.util.Scanner;

// public class ScannerExample {
//     public static void main(String[] args) {
//         // Create a Scanner object to take input from the console
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter your age: ");
//         int age = scanner.nextInt();  // Read an integer input

//         System.out.println("You are " + age + " years old.");
        
//         scanner.close();  // Close the scanner
//     }
// }
