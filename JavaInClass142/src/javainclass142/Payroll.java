package javainclass142;
import java.util.Scanner;
public class Payroll {
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your name? : ");
        String name =keyboard.nextLine();
        System.out.print("How many did you work this week? : ");
        int hour =keyboard.nextInt();
        System.out.print("What is your pay rate? : ");
        float money = keyboard.nextFloat();
        System.out.println("\n*****************************************\n");
        System.out.println("----->Hello!!!! " + name);
        System.out.println("----->Your Salary is " + ( hour * money ) + " Baht");
        System.out.println("\n****************Thank You****************");
    }
}