package javainclass142;
import java.util.Scanner;
public class while1 {
    public static void main(String[]args){
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name =kb.nextLine();
        int n=1;
        while(n<=6){
            if(n<=5){
                System.out.println(n+". "+name);
            }
            else{
                System.out.println("--->>End Program");
            }
            n++;
        }
        
    }
}
