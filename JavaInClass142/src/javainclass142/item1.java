package javainclass142;
import java.util.Scanner;
public class item1 {
    public static void main(String[]args){
        System.out.println("==========Enter===========\n");
        Scanner kb = new Scanner(System.in);
        System.out.print("รหัสพนักงาน : ");
        String id = kb.nextLine();
        System.out.print("ชื่อพนักงาน : ");
        String fName = kb.nextLine();
        System.out.print("นามสกุลพนักงาน : ");
        String lName = kb.nextLine();
        System.out.print("เงินเดือน : ");
        float salary = kb.nextFloat();
        System.out.print("จำนวนปีที่ทำงาน : ");
        int year = kb.nextInt();
        float bonus,total;
        String b;
        switch(year){
            case 1 : bonus = 0;
                     b = "0%";
                    break;
            case 2 : bonus = 0;
                     b = "0%";
                    break;
            case 3 : bonus = 0.03f;
                     b = "3%";
                    break;
            case 4 : bonus = 0.05f;
                     b = "5%";
                    break;
            case 5 : bonus = 0.05f;
                     b = "5%";
                    break;
            case 6 : bonus = 0.1f;
                     b = "10%";
                    break;
            case 7 : bonus = 0.1f;
                     b = "10%";
                    break;
            default : bonus = 0.15f ;
                      b = "15%";
        }
        bonus = salary * bonus;
        total = salary + bonus;
        System.out.println("\n==========Report===========\n");
        System.out.println("\tรหัสพนักงาน : "+id);
        System.out.println("\tชื่อ-นามสกุล : "+fName+"  "+lName);
        if(year == 0 || salary == 0){
            System.out.println("\t\tError!!!!");
        }
        else{
            System.out.println("\tจำนวนเงินโบนัส "+b +" : " +bonus);      
            System.out.println("\tจำนวนเงินทั้งหมดที่ได้ : "+total);
        }
    } 
}
