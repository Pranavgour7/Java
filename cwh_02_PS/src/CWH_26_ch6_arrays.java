public class CWH_26_ch6_arrays {
    public static void main(String[] args) {
//        Classroom of 500 student -> You have to store marks of 500 Student
        //You have two option -
        // 1) Create 500 variables
        //2) use an array (recommended)

        //There are three main ways to create arrays
        //1. Declaration and memory allocation
        //int [] marks = new int[5];

        //2. Declaration and then memory allocation
        //int [] marks;
        //marks = new int[5];
        //Initialising
//        marks[0]= 45;
//        marks[1]= 75;
//        marks[2]= 85;
//        marks[3]= 65;
//        marks[4]= 15;
        //marks [5] = 96; -> throws an error

        // Declaration ,memory and initialization together
        int [] marks = {98,45,25,92,26};
        System.out.println(marks[4]);
    }
}
