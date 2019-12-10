package javainclass142;
public class StringCharAt {
    public static void main (String[]args){
        char letter;
        int stringSize;
        String name = "Padrada";
        
        String bigName = name.toUpperCase(); //ตัวพิมพ์ใหญ่
        String littleName = name.toLowerCase(); //ตัวพิมพ์เล็ก
        
        String sub = name.substring(0,3); //แสดงตัวอักษรตั้งแต่ตำแหน่งที่ 0 ถึง 3 ถ้าเป็น 1 จะดึงตั้งแต่ index ที่ 1 จนหมด
        
        letter = name.charAt(2); //แสดงตัวอักษร index ที่ 2
        
        stringSize = name.length(); //แสดงจำนวนตัวอักษรทั้งหมด รวมเว้นวรรคด้วย
        
        System.out.println(letter);
        System.out.println(name + " has " + stringSize + " Characters ");
        System.out.println(bigName);
        System.out.println(littleName);
        System.out.println(sub);
    }
}