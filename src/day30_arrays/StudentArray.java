package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {
        String[] student1 = new String[5];
        student1[0] = "AD1234";
        student1[1] = "Adam";
        student1[2] = "Smith";
        student1[3] = "B22";
        student1[4] = "202-542-1235";


        String[] student2 = {"19" , "Kirill" , "Skolpen" , "Batch 22" , "1234567"};

        System.out.println("student1 id = " + student1[0]);
        System.out.println("student1 firstname = " + student1[1]);
        System.out.println("student1 lastname = " + student1[2]);
        System.out.println("student1 batch num = " + student1[3]);
        System.out.println("student1 mobile num = " + student1[4]);


        /**check if student1 data array contains 5 items
        //true: PASS: data array has correct length
        //false: FAIL: data array has incorrect length
         */

        if(student1.length == 5) {
            System.out.println("PASS: data array has correct length");
        } else {
            System.out.println("FAIL: data array has incorrect length");
        }

         /**
         check if student1 and student2 arrays have same number of data
         TRUE: PASS: data arrays length match
         FALSE: FAIL: data arrays length mismatch
         */

         if (student1.length == student2.length) {
             System.out.println("PASS: data arrays length match");
         } else {
             System.out.println("FAIL: data arrays length mismatch");
         }

        /**
         * read from array and print firstname and lastname in all uppercase
         * ADAM SMITH
         */

        System.out.println((student1[1] + " " + student1[2]).toUpperCase());
    }
}
