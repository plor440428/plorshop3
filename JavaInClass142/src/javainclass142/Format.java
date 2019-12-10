package javainclass142;
import java.text.DecimalFormat;
public class Format {
    public static void main(String[]args){
        double num1 = 0.1666666667;
        double num2 = 1.6666666667;
        double num3 = 16.666666667;
        double num4 = 1666.6666667;
        
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        
        System.out.println(formatter.format(num1));
        System.out.println(formatter.format(num2));
        System.out.println(formatter.format(num3));
        System.out.println(formatter.format(num4));
        
    }
    
}
