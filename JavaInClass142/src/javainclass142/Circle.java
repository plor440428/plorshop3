package javainclass142;
import java.util.Scanner;
public class Circle {
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input Radius : ");
        float radius = keyboard.nextFloat();
        float pi = 3.14f;
        System.out.println("==================================");
        float area;
        if (radius>0){
            area = (radius*radius)*pi;
            System.out.println("พื้นที่วงกลม คือ " + area);
        }
        else{
            System.out.println("****ค่ารัศมีของวงกลมต้องไม่เป็น 0 !!!****");
        }
    }
}
