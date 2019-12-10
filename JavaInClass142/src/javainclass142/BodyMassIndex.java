package javainclass142;
import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Height : ");
        float height=keyboard.nextFloat();
        System.out.print("Enter Weight : ");
        float weight=keyboard.nextFloat();

        float bmi = (weight*10000)/(height*height);
        System.out.println("============================");
        System.out.println("BMI = " + bmi);
        if (bmi<18.5){
            System.out.println("You Thin!!!");
        }
        else if(bmi<=24.9){
            System.out.println("You Normal!!!");
        }
        else if(bmi<=29.9){
            System.out.println("You Fat!!!");
        }
        else{
            System.out.println("You Obese!!!");
        }
        System.out.println("============================");
    }  
}

