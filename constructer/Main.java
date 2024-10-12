package constructer;

 public class Main {
    int num1;
    int num2;

    Main() {
      num1 = -1;
      num2 = -1;
    }

    public static void main(String[] args) {
      // We didn't created any structure
      // a default constructor will invoke here
      Main obj_x = new Main();

      // Printing the values
      System.out.println("num1 : " + obj_x.num1);
      System.out.println("num2 : " + obj_x.num2);
  
      // Printing the values
      System.out.println("num1 : " + obj_x.num1);
      System.out.println("num2 : " + obj_x.num2);
    }
  }
    

