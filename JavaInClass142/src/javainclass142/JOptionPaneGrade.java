package javainclass142;
import javax.swing.JOptionPane;
public class JOptionPaneGrade {
    public static void main(String[]args){
        int score;
        String str = JOptionPane.showInputDialog("Enter a Number ");
        score = Integer.parseInt(str);  
        
        if(score<1){
            JOptionPane.showMessageDialog(null, "คะแนนมี 1 ถึง 100 คะแนน" +str);}
        else if(score<50){
            JOptionPane.showMessageDialog(null, "Grade F คะแนน " +str);}
        else if(score<60){
            JOptionPane.showMessageDialog(null, "Grade D คะแนน " +str);}
        else if(score<70){
            JOptionPane.showMessageDialog(null, "Grade C คะแนน " +str);}
        else if(score<80){
            JOptionPane.showMessageDialog(null, "Grade B คะแนน " +str);}
        else{
            JOptionPane.showMessageDialog(null, "Grade A คะแนน " +str);}

    }
}
