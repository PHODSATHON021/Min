import java.util.Scanner; //นำเข้าคลาส Scanner จาก package java.util

public class W04_01_AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // สร้างอ็อบเจ็กต์ของคลาส Scanner
        System.out.print("้รัศมีของวงกลม"); // แสดงข้อความที่ใช้ป้อนค่ารัศมี
        double radius = sc.nextDouble(); // รับค่ารัศมีจากผู้ใช้และเก็บในตัวแปร radius

        double radius; // ประกาศตัวแปลเก็บค่ารัศมี
        radius = 34; // กำหนดรัศมีเป็น 10
        double area; // ประกาศตัวแปรเก็บค่าพื้นที่
        double PI = 3.14159; // ประกาศค่าคงที่ PI

        area = PI * radius * radius; // คำนาวณพื้นที่ของวงกลม
        System.out.println("พื้นที่ของวงกลมที่มีรัศมีเท่ากับ " + radius + "  คือ " + area);
        System.out.println("            _       \r\n" + //
                "           (_)      \r\n" + //
                "  _ __ ___  _ _ __  \r\n" + //
                " | '_ ` _ \\| | '_ \\ \r\n" + //
                " | | | | | | | | | |\r\n" + //
                " |_| |_| |_|_|_| |_|\r\n" + //
                "                    \r\n" + //
                "                    ");

    }
}