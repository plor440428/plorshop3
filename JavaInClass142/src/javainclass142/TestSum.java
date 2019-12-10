package javainclass142;
public class TestSum {
    public static void main(String[]args){
        int num =0;
        for(int n=1;n<=100;n++){
            if(n%3==0 || n%5==0){
                System.out.println("Number : " +n);
                num=num+n;
            }
            
        }
        System.out.println("Sum ---> "+num);
    }
}
