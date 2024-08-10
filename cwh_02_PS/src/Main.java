import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        //Question 1
        float a = 7/4.0f * 9/2.0F;
        System.out.println(a);


//        //Question 2
        char grade = 'B';
        char b = (char)(grade +8);
        System.out.println(b);
       // DECRYPTING
       char Grade = 'K';
       Grade = (char)(Grade - 8);
        System.out.println(Grade);

        // Question 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the num");
        int g = sc.nextInt();
        System.out.println(g>8);

        // Question 4
        float v = 9;
        float u = 5;
        float s = 1;
        float h = 6;
        float z = (v*v-u*u)/(2*s*h);
        System.out.println(z);

                System.out.println(7*49/7+35/7);
    }
}