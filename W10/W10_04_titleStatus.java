//ตรวจสอบคำนำหน้าชื่อ
// ด.ช. ด.ญ นาย นางสาว 
// ด.ญ. หรือ นางสาว ให้แสดงข้อความว่า "เป็นผู้หญิง"
// ด.ช. หรือ นางสาว ให้แสดงข้อความว่า "เป็นผู้ชาย"
// อายุ
// เพศ อายุ สถานะสมรส

package W10;

import java.util.Scanner;

public class W10_04_titleStatus {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("ระบุเพศ (male/female): ");
        String gender = kb.next();

        System.out.print("ระบุอายุ: ");
        int age = kb.nextInt();

        System.out.print("สถานสมรส (single/married): ");
        String isMarried = kb.next();

        if (gender.equalsIgnoreCase("male")) {
            // ถ้าเป็นผู้ชาย => ด.ช. นาย
            if (age < 15) {
                System.out.println("ด.ช. ");
            } else {
                System.out.println("นาย ");
            }
        } else {
            if (age < 15) {
                // ถ้าเป็นผู้หญิง => ด.ญ. นางสาว

                System.out.println("ด.ญ. ");

            } else if (gender.equalsIgnoreCase("married")) {
                System.out.println("นาง ");
            } else {
                System.out.println("นางสาว ");
            }
        }

    }
}