import java.util.Scanner;
public class cwh_29_ps06 {
    public static void main(String[] args) {
        // Question 1

//        float [] a = {20.5f,21.5f,22.5f,23.5f,24.5f};
//        System.out.println(a[0]+a[2]+a[1]+a[3]+a[4]);

        // Method 2
//        float sum = 0;
//for (float element:a){
//    sum = sum + element;
//}
//        System.out.println(sum);

// Question 2
//        Scanner sc = new Scanner(System.in);
//        float b = sc.nextFloat();
//        for (float element:a) {
//            if (b == element) {
//                System.out.println("It is present in array");
//                break;
//            } else if (b!=element) {
//                System.out.println("It is not present");
//                break;
//            }
//        }

        // Question 3
//float sum = 0;
//       float[] marks = {45f,25f,45.4f,32.5f,57.6f};
//       for (float element:marks){
//           sum = sum + element;
//       }
//        System.out.println("The average value is " + sum/marks.length);
//
       // Question 4
// my approach
//        int [][] mat1 = {{2,3,4},
//                         {4,2,1}};
//                for (int i = 0;i<mat1.length;i++){
//                    for(int j = 0;j<mat1[i].length;j++){
//                        System.out.print(mat1 [i] [j] + " ");
//                    }
//                    System.out.println("");
//                }
//
                // cwh approach

//        int [][] mat1 = {{2,3,4},
//                         {4,2,1}};
//        int [][] mat2 = {{1,3,4},
//                         {4,2,1}};
//        int [][] result = {{0,0,0},
//                         {0,0,0}};
//
//        for (int i =0;i<mat1.length ; i++){
//            for(int j =0;j<mat1[i].length;j++){
//                System.out.printf("Setting value of i = %d and j = %d" ,i,j);
//                result[i][j] = mat1[i][j] + mat2[i][j];
//                System.out.println();
//            }
//        }
//
//        Printing the elements of a 2-D array
//        for (int i =0;i<mat1.length ; i++){               // Row number of times
//            for(int j =0;j<mat1[i].length;j++){              // Column num of times
//
//                result[i][j] = mat1[i][j] + mat2[i][j];
//                System.out.print(result [i] [j] + " ");
//            }
//            System.out.println();               // Prints new line
//
//        }

        // Question 5              {{{{ IMPORTANT CONCEPT ( HOW TO REVERSE AN ARRAY) }}}}

//int[] a = {1,2,3,4,5,6};
//int l = a.length;
//int n = Math.floorDiv(l,2);
//int temp;
//for (int i = 0;i<n;i++) {
//// Swap a[i] with a[l-i-1}
//    // a  b  temp
//    //|4| |3| ||
//    temp = a[i];
//    a[i] = a[l - i - 1];
//    a[l - i - 1] = temp;
//}
//
//for (int element: a){
//    System.out.print(element + " ");
//}

// Question 6
//        int[] a = {1,2,3,4,5,-6,-85897598,787};
//int max = Integer.MIN_VALUE;
//for (int e: a){
//    if (e>max){
//max = e;
//    }
//}
//        System.out.println("The value of the maximum element is " + max);
//
//        System.out.println(Integer.MIN_VALUE);                            // Give the min value in java
//        // Give the max value in java
//        System.out.println(Integer.MAX_VALUE);
//
//        // Question 7
//        int min = Integer.MAX_VALUE;
//for (int e: a ){
//    if (e<min){
//        min=e;
//    }
//}
//        System.out.println("The value of the min value is " + min);

// Question 8;
        boolean isSorted = true;
        int[] a = {1,2,3,4,5,6,46,1};                               //Sorted means it is in increasing order
        for (int i = 0;i < a.length - 1;i++){                           //in 45.0 time stamp of this video
            if (a[i] > a[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The array is  sorted");
        }
        else {
            System.out.println("The array is not sorted");
        }
    }
}
