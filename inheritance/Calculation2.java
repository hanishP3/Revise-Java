
//Inheritance : The properties and methods of one class(parent class) can be accesed by another class(child class)
//We use the keyword extends

package inheritance;

class Calculation{
    public void add(int x,int y){
        int z;
        z=x+y;
        System.out.println("x+y= "+z);
    }
    public void sub(int x,int y){
        int z = x-y;
        System.out.println("X-Y= "+z);
    }
}

public class Calculation2 extends Calculation {

    public void multi(int x,int y){
        int z = x*y;
        System.out.println("X*Y= "+z);
    }
    public static void main(String args[]) {

        Calculation2 obj1 = new Calculation2();
        obj1.add(2,3);
        obj1.sub(2,3);
        obj1.multi(2, 3);
        }
}
