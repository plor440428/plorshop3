package javainclass142;
import java.util.Scanner;
public class while2 {
    public static void main(String[]args){
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name =kb.nextLine();
        int n=1;
        while(n<=6){
            System.out.println(n+". "+name);  
            n++;
        }
        System.out.println("--->>END PROGRAM");
        
    }
}
