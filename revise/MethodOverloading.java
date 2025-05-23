
class Add{
    public int add(int n1,int n2){
        return n1+n2;
    }
}

public class MethodOverloading{
    public static void main(String[] args) {
        Add a1 = new Add();
       System.out.println(a1.add(5,6)); 
    }
}
