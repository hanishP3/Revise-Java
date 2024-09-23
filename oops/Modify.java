
package oops;
    class Dog {
        // Declaring and initializing the attributes
        String breed = "cat";
        int age = 2;
        String color = "Black";
       // final String favColor = "Grey";       If we add final kwyword before our attribute, We furthur cant modify it 
      }
      
    public class Modify {
        public static void main(String[] args) {
          // Creating an object of the class Dog
          Dog obj = new Dog();
         
          // Accessing class attributes & printing the values
          System.out.println("Before modifying:");
          System.out.println(obj.breed);
          System.out.println(obj.age);
          System.out.println(obj.color);
      
          // Modifying class attributes
          obj.breed = "Golden Retriever";
          obj.age = 3;
          obj.color = "Golden";
          //obj.favColor="white";
          
          // Printing
          System.out.println("\nAfter modifying:");
          System.out.println(obj.breed);
          System.out.println(obj.age);
          System.out.println(obj.color);
        }
      }


