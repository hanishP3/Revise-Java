//Program to illustrate class and object
//main method within a class
class Student{
    int id = 45;
    String name = "hanish";

public static void main(String args[]) {
    Student s1 = new Student();
    System.out.println(s1.id);
    System.out.println(s1.name);
} 
}

// separate main method and a class
// We can have multiple classes in different Java files or single Java file. If you define multiple classes in a single Java source file, it is a good idea to save the file name with the class name which has main() method.

class Friends{
    String name = "hanish";
    String name2 = "christina";
    String name3 = "karen";
}
class Students{
public static void main(String args[]){
    Friends f1 = new Friends();
    System.out.println(f1.name);
    System.out.println(f1.name2);
    System.out.println(f1.name3);
}}