public class CWH_14_strings_methods {
    public static void main(String[] args) {
        String name = "Harry";
        //STRING METHODS---
//1
        int lstring = name.length();
        System.out.println(lstring);
//2
        String tlcString = name.toLowerCase();
        System.out.println(tlcString);
//3
        String tuc = name.toUpperCase();
        System.out.println(tuc);
//4
        String name2 = "      Harry       ";
        String trim = name2.trim();
        System.out.println(trim);

        System.out.println(name.substring(2));                 //H=0
        System.out.println(name.substring(3));                 //a=1
                                                               //  r=2
System.out.println(name.substring(3,4));                       //r=3
System.out.println(name.substring(0,4));                        //y=4

        System.out.println(name.replace('r','p'));
        System.out.println(name.replace("rry","ier"));

        System.out.println(name.startsWith("Ha"));
        System.out.println(name.startsWith("ry"));

        System.out.println(name.endsWith("rry"));
        System.out.println(name.endsWith("Ha"));

        System.out.println(name.charAt(2));


        System.out.println(name.indexOf("r"));
        System.out.println(name.indexOf("r",3));

        String name3 = "Harryrryrry";
        System.out.println(name3.indexOf("rry"));
        System.out.println(name3.indexOf("rry",3));
        System.out.println(name3.indexOf("rry4557",3));

        System.out.println(name3.lastIndexOf("rry"));
        System.out.println(name3.lastIndexOf("rry",6));

        System.out.println(name.equals("Harry"));
        System.out.println(name.equals("harry"));

        System.out.println(name.equalsIgnoreCase("haRRy"));

        System.out.println("Hi my name is Pranav \' welcome");
        System.out.println("Hi my name is Pranav \" welcome \"");
        System.out.println("Hi my name is Pranav \n welcome");
        System.out.println("Hi my name is Pranav \t welcome");
        System.out.println("Hi my name is Pranav \\ welcome");






    }
}
