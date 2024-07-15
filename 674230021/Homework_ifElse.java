import java.util.Scanner;
public class Homework_ifElse {
    public static void main(String[] agrs) {

        Scanner sc = new Scanner(System.in);
        System.out.print("ป้อนค่ารัศมีของวงกลม");
        
        double radius = sc.nextDouble(); 
        double area;  //ประกาศตัวแปรเก็บค่าพื้นที่
        double PI=3.14159; //ประกาศพื้นที่ของวงกลม
        if(radius>0){
            area = PI*radius*radius; //คำนวณพื้นที่ของวงกลม

            System.out.println("พื้นที่ของวงกลมรัศมีเท่ากับ" + radius + "คือ" + area);
            
        }else{
            System.out.println("Error: รัศมีต้องมากกว่า 0");
        }
    }
}