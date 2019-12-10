package javainclass142;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class TotalSales {
    public static void main(String[]args){
        double total=0;
        String str = JOptionPane.showInputDialog("โปรดป้อนจำนวนวัน :  ");
        int day = Integer.parseInt(str);  
        
        DecimalFormat formatter = new DecimalFormat("#,###,###.00");
        
        for(int i=1;i<=day;i++){
            String str2 = JOptionPane.showInputDialog("ป้อนยอดขายในวันที่ "+i+" : ");
            double sale = Double.parseDouble(str2);
            total = total+sale;
        }
        JOptionPane.showMessageDialog(null,"ผลรวมยอดขายทั้งหมด \n ====>"+formatter.format(total)+" บาท");
    }
}
