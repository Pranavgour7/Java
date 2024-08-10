public class CWH_27_arrays_foreachloop {
    public static void main(String[] args) {
       int [] marks ={98,45,79,99,80};
//        float [] marks ={98.5f,45.5f,79.5f,99.5f,80.5f};
//        System.out.println(marks.length);
//        System.out.println(marks[3]);
//String [] students = {"Harry","Rohan","Pranav","Vicky"};
//        System.out.println(students.length);
//        System.out.println(students[2]);

        // Displaying array in a naive(simple) method
//        System.out.println("Printing using naive method");
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);

        // Displaying array by the help of for loop
//        System.out.println("Printing using for loop");
//        for(int i = 0;i<marks.length;i++){
//            System.out.println(marks[i]);
//        }

        // Quick Quiz -> Displaying array in reverse order
        System.out.println("Printing using for loop in reverse order!");
        for (int i = marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }

        // Displaying array while using for-each loop
        System.out.println("Printing using for - each loop ");
        for(int element: marks){
            System.out.println(element);
        }
    }
}
