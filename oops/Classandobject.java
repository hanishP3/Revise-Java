package oops;
//class name - Classandobject
//has proerties and methods
public class Classandobject {
    int age;
    String gender;

    public void Greetings(String name){
        System.out.println("Hi "+name+" welcome to ClassAndObject file");
    }
    public static void main(String[] args) {
        Classandobject obj1 = new Classandobject();
        obj1.Greetings("hanish");
    }
}

