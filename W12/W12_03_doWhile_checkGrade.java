package W12;

import java.util.Scanner;

public class W12_03_doWhile_checkGrade {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int score;  // ประกาศตัวแปรเพื่อเก็บค่าที่ผู้ใช้ป้อน

        do {
            System.out.print("Enter your score between 1 and 100: ");
            score = kb.nextInt();  // ให้ผู้ใช้ป้อนข้อมูลซ้ำจนกว่าจะถูกต้อง
            // แสดงข้อความให้ผู้ใช้ป้อนข้อมูล between 1 and 100:
            // รับค่าจากคีย์บอร์ดเก็บไว้ในตัวแปร number
        } while (score < 1 || score > 100);   // ถ้าผู้ใช้ป้อนไม่ถูกต้องให้ป้อนใหม่
        if (score >= 80) {
            grade = "A";
        } else {
            // ใส่ค่าตัวแปร
            String grade;
            if (score >= 70) {
                grade = "B";
            } else if (score >= 60) {
                grade = "C";
            } else if (score >= 50) {
                grade = "D";
            } else {
                grade = "E";
            }
            // แสดงข้อมูลที่ผู้ใช้ป้อน เช่น ou entered: 75
            // ตรวจสอบเกรด
            kb.close(); // ปิด Scanner object
        }
    }
}
