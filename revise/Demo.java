class Students {
    String name;
    int rollNo;
    String phoneNumber;
}

public class Demo {
    public static void main(String args[]) {
        Students s1 = new Students();
        Students s2 = new Students();
        Students s3 = new Students();

        s1.name = "hanish";
        s1.rollNo = 545;
        s1.phoneNumber = "9309300512";

        s2.name = "leo";
        s2.rollNo = 505;
        s2.phoneNumber = "9309300512";

        s3.name = "han";
        s3.rollNo = 595;
        s3.phoneNumber = "9309300512";

        //create an array which stores objects inint.
        //NOTE**
        // here it only stores the reference not the complete data
        // the below the create
        Students[] studentsArray = new Students[3];
        // the below is assign
        studentsArray[0] = s1;
        studentsArray[1] = s2;
        studentsArray[2] = s3;

        System.out.println(studentsArray[0]);


        // the below is the enchanced for loop.
        /*
         *  for(datatype var-name : array or collection ){
         *  ........................
         * }
         */
        for(Students stud: studentsArray){
            System.out.println(stud);
        }



    }
}