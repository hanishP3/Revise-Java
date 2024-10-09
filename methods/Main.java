package methods;
class Students{
    String name = "hanish";
    int age = 21;
    int roll_no = 45;
    float percentage = 85.99f;
}
public class Main{
    public static void main(String args[]) {
        Students s1 = new Students();
        System.out.println("The name is "+s1.name);
        System.out.println("The age is "+s1.age);
        System.out.println("The percentage is "+s1.percentage);
    }
}