package javainclass142;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[]args){
        Scanner kb = new Scanner(System.in);
        System.out.print("โปรดใส่ตัวเลข : ");
        int number = kb.nextInt();
        
        switch(number){
            case 1 : System.out.println("คุณใส่เลข 1");
                     break;
            case 2 : System.out.println("คุณใส่เลข 2");
                     break;
            case 3 : System.out.println("คุณใส่เลข 3");
                     break;
            default : System.out.println("คุณไม่ได้ใส่ค่าที่เป็น 1 , 2 , 3");
                     
        }
}
}
