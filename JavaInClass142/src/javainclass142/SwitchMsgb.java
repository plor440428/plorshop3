package javainclass142;
import  javax.swing.JOptionPane;
public class SwitchMsgb {
    public static void main (String[]args){
        
        String str =JOptionPane.showInputDialog("โปรดใส่ตัวเลข : ");
        int number = Integer.parseInt(str);
        
        switch(number){
            case 1 :
                JOptionPane.showMessageDialog(null,"คุณใส่เลข 1");
                break;
            case 2 :
                JOptionPane.showMessageDialog(null,"คุณใส่เลข 2");
                break;
            case 3 :
                JOptionPane.showMessageDialog(null,"คุณใส่เลข 3");
                break;
            default :
                JOptionPane.showMessageDialog(null,"คุณไม่ได้ใส่ค่าที่เป็น 1 , 2 , 3");
                break;
        }
    } 
}
