package javainclass142;
public class Increment {
    public static void main(String[]args){
        int x,y; //ประกาศตัวแปร x,y
        x = 10;
        y = x++; //x++ คือ x = x + 1 //y เอาค่า x มาก่อน ก่อนที่มันจะบวก
        System.out.println("X = "+x+"\nY = "+y);
        y = ++x; //y เอาค่า x + 1 ก่อนแสดงค่า
        System.out.println("X = "+x+"\nY = "+y);
    }
}
