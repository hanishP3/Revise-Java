package basics.Loops;
public class LoopExample {
    public static void main(String[] args) {
        // For Loop: Print numbers from 1 to 5
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number (for): " + i);
        }

        // While Loop: Print numbers from 1 to 5
        System.out.println("\nWhile Loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Number (while): " + j);
            j++;
        }

        // Do-While Loop: Print numbers from 1 to 5
        System.out.println("\nDo-While Loop:");
        int k = 1;
        do {
            System.out.println("Number (do-while): " + k);
            k++;
        } while (k <= 5);
    }
}



