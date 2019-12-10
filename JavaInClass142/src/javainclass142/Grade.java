package javainclass142;
import java.util.Scanner;
public class Grade {
    public static void main(String[]args){
        int score;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a Score : ");
        score = keyboard.nextInt();
        if(score<1){
            System.out.println("คะแนนมี 1 ถึง 100 คะแนน");}
        else if(score<50){
            System.out.println("Grade F");}
        else if(score<60){
            System.out.println("Grade D");}
        else if(score<70){
            System.out.println("Grade C");}
        else if(score<80){
            System.out.println("Grade B");}
        else{
            System.out.println("Grade A");}
    }
}