package javainclass142;
import java.util.Scanner;
public class CoinExchange {
    public static void main(String[]args){
        System.out.println("\tโปรแกรมแลกเหรียญ");
        System.out.println("**********************************");
        Scanner kb = new Scanner(System.in);
        System.out.print("โปรดใส่จำนวนเงิน : ");
        int money =kb.nextInt();
            if(money%10!=0){
                int ten = money/10;
                System.out.println("เหรียญ 10 : "+ten+" เหรียญ");
                money=money%10;
            }
            else{
                int ten = money/10;
                System.out.println("เหรียญ 10 :"+ten+" เหรียญ");
                money-=money;
            }
            if(money%5!=0){
                int five = money/5;
                System.out.println("เหรียญ 5 :"+five+" เหรียญ");
                money=money%5;
            }
            else{
                int five = money/5;
                System.out.println("เหรียญ 5 :"+five+" เหรียญ");
                money-=money;
            }
            if(money%2!=0){
                int two = money/2;
                System.out.println("เหรียญ 2 :"+two+" เหรียญ");
                money=money%2;
            }
            else{
                int two = money/2;
                System.out.println("เหรียญ 2 :"+two+" เหรียญ");
                money-=money;
            }
            if(money%1==0){
                System.out.println("เหรียญ 10 :"+money+" เหรียญ");
                money-=money;
            }
        System.out.println("**********************************");
    }
}
