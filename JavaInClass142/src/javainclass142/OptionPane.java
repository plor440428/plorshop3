package javainclass142;
import javax.swing.JOptionPane;
public class OptionPane {
    public static void main(String[]args){
        int number;
        String str = JOptionPane.showInputDialog("Enter a Number ");
        number = Integer.parseInt(str);
        
        JOptionPane.showMessageDialog(null, "You Enter " +str);
    }
    
}
