public class CWH_15_ps3 {
    public static void main(String[] args) {
        // problem 1
       String name="Harry";
        System.out.println(name.toLowerCase());


        //problem 2
        String name1="H  a  r  r  y";
        System.out.println(name1.replace(" ","_"));


        // Problem 3
        String letter = "Dear <|name|>, Thanks a lot! ";
        System.out.println(letter.replace("<|name|>","Harry"));

        //Problem 4
        String letter2 = "This string contains double and triple spaces";
        System.out.println(letter2.indexOf("  "));
        System.out.println(letter2.indexOf("   "));

        //Problem 5
        String letter3 = "Dear Harry,\n\tThis java course is nice\nThanks ";
        System.out.println(letter3);
    }
}
