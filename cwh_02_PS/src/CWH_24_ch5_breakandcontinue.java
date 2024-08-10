import java.util.Scanner;
public class CWH_24_ch5_breakandcontinue {
    public static void main(String[] args) {
        //Break and continue using loops
//        for(int i = 0;i<=5;i++){
//            System.out.println(i);
//            System.out.println("java is great!");
//            if (i==2){
//                System.out.println("loop end here!");
//                break;
//            }
//        }

//        int i = 0;
//        while(i<=5){
//            System.out.println(i);
//            System.out.println("java is great!");
//            if (i==3){
//                System.out.println("loop end here!");
//                break;
//            }
//            i++;
//        }

        ////CONTINUE IN LOOP
//        for(int i = 0;i<=5;i++){
//            if(i==3){
//                System.out.println("End the loop");
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("Java is great!");
//        }
        int i = 0;
        do {
            i++;
            if(i==3){
                System.out.println("End the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great!");
        }while (i<5);


        System.out.println("tell me the num");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2!=0){
            System.out.println("Num is odd!");
        }
        else {
            System.out.println("Num is even");
        }


    }
}
