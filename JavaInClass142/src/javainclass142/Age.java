package javainclass142;
import java.util.Scanner;
public class Age {
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("คุณอายุเท่าไหร่ : ");
        int age = keyboard.nextInt();
        if (age>25){
            System.out.println("คุณแก่เกินเรียน");
        }
        if (age<=25){
            System.out.println("คุณอยู่ในวัยเรียน");
        }
    }
    
}
