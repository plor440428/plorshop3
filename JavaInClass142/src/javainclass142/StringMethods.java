package javainclass142;
public class StringMethods {
    public static void main(String[]args){
        String data ="Java is Great Fun";
        String bigData = data.toUpperCase();
        String littleData = data.toLowerCase();
        char showData = data.charAt(3);
        int sizeData = data.length();
        System.out.println(data);
        System.out.println("    Upper Size ----> " + bigData);
        System.out.println("    Lower Size ----> " + littleData);
        System.out.println("    Character index no.3 ----> " + showData);
        System.out.println(data + " has " + sizeData + " Characters ");
        
    }
}
