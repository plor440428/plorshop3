package javainclass142;
import java.util.Scanner;
public class CoinExchange2 {
    public static void main(String[]args){
        System.out.println("\tโปรแกรมแลกเหรียญ");
        System.out.println("**********************************");
        Scanner kb = new Scanner(System.in);
        System.out.print("โปรดใส่จำนวนเงิน : ");
        int money =kb.nextInt();
            int ten = money/10;
            money%=10;
            int five = money/5;
            money%=5;
            int two = money/2;
            money%=2;
            int one = money/1;
        System.out.println("เหรียญ 10 : "+ten+" เหรียญ");
        System.out.println("เหรียญ 5 : "+five+" เหรียญ");
        System.out.println("เหรียญ 2 : "+two+" เหรียญ");
        System.out.println("เหรียญ 1 : "+one+" เหรียญ");
        System.out.println("**********************************");
    }
}
