package javainclass142;
import java.util.Scanner;
public class doWhile1 {
    public static void main(String[]args){
        int num;
        do{
            Scanner kb = new Scanner(System.in);
            System.out.print("Enter number : ");
            num = kb.nextInt();
        }while(num<100);
        System.out.print("End Program");
    }  
}