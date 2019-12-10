package javainclass142;
public class StringMethod2 {
    public static void main (String[]args){
        String fName ="Padrada";
        String lName ="Promkijjanon";
        char oneChar = fName.charAt(0);
        String show = fName.substring(3);
        String showTwo = lName.substring(2,5);
        char lastChar = lName.charAt(11);
        String showThree = lName.substring(3);
        
        System.out.println("Full Name ----> " +fName);
        System.out.println("Last Name ----> " +lName);
        System.out.println("    Frist Character ----> " +oneChar);
        System.out.println("    Full Name Character index no.3 ----> " +show);
        System.out.println("    Last Name Character index no.2 - 5 ----> " +showTwo);
        System.out.println("    Last Character ----> " +lastChar);
        System.out.println("    Last Name Character index no.3 - last ----> " +showThree);
    }
}
