package javainclass142;
import java.util.Scanner;
public class StringMethods3 {
    public static void main (String[]args){
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter Data : ");
        String data = kb.nextLine();
        String upData = data.toUpperCase();
        String lowData = data.toLowerCase();
        char charData = data.charAt(3);
        int lData = data.length();
        
        System.out.println(">>>Data is = "+data);
        System.out.println(">>>Upper Data is = "+upData);
        System.out.println(">>>Lower Data is = "+lowData);
        System.out.println(">>>Character = "+charData);
        System.out.println(">>>Length Data = "+lData);
    }
}
