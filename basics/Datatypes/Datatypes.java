/*
 *  Data Types in Java
 *  Primitive Data Type: such as boolean, char, int, short, byte, long, float, and double
    Non-Primitive Data Type or Object Data type: such as String, Array, etc.
 */

package basics.Datatypes;

public class Datatypes {
        public static void main(String[] args){
            //byte range - 128 to 127
            byte byteNum = 2;
            //char range - characters representation of ASCII values 0 to 255
            char initial = 'p';
            //short range - 32,768 to 32,767
            short amount = 29000;
            //int range  - -2,147,483,648 to 2,147,483,647
            int  number = 777;
            //long range - ~ and 9,223,372,036,854,775,807 add L at the end of the value
            long longNum = 892378733456921L;
            //float range - upto 7 decimal digits
            float floatNum = 89.909098f;
            //double range - upto 16 decimals 
            double doubleNum = 9087.809801656d;

            System.out.println(byteNum);
            System.out.println(initial);
            System.out.println(amount);
            System.out.println(number);
            System.out.println(longNum);
            System.out.println(floatNum);
            System.out.println(doubleNum);
        }
}
