//AN ARRAY IS A COLLECTION OF SIMILAR DATATYPES ITEMS //
//DECLARING AN ARRAY AND ACCESING THE ARRAY
package arrays;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
    String[] car = {"bmw","Benz","Toyota"};
    System.out.println(car[0]);
    //CHANGE THE ITEM INEX[0]
    car[0] = "hanish";
    System.out.println(car[0]);
    //LENGTH PROPERTY
    System.out.println(car.length);
    //FOR-EACH
    //PRINTS OUT EACH AND EVERY ITEMS IN AN ARRY
    for (String i : car) {
        System.out.println(i);
    }
    //2D ARRAY
    int[][] lucky = {{1,2,5,66,88},{44,66,99,00}};
    for (int[] ii : lucky) {
        System.out.println(Arrays.toString(ii));
    }
}
}

