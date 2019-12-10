package javainclass142;
import java.util.Scanner;
public class Cal1 {
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = keyboard.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = keyboard.nextInt();
        int sum;
        sum = num1 + num2;
        System.out.println("--->Sum = "+sum);
    }
}
