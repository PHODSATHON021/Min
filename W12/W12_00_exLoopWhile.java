// ให้แสดงผลลัพธ์ดังนี้
// ===============
// รอบที่ 1 
// รอบที่ 2 
// รอบที่ 3 
// รอบที่ 4 
// รอบที่ 5 
package W12;

public class W12_00_exLoopWhile {

    public static void main(String[] args) {

// โครงสร้างคำสั่งลูป for / While แบ่งออกเป็น 3 ส่วน
// 1. ส่วนตัวแปรเริ่มต้น
// 2. เงื่อนไข
// 3. การเพิ่มค่า / การลดค่า
// TODO 1
        System.out.println("TODO 1-For Loop");
        for (int i = 1; i <= 5; i++) {
            System.out.println("รอบที่ " + i);
        }
        System.out.println("-------------------------------------------- ");

        System.out.println("TODO 1-While Loop");
        int n1 = 1;
        while (n1 <= 5) {
            System.out.println("รอบที่ " + n1);
            n1++;
        }
        System.out.println("============================================ ");

//  ============================TODO 1 End While Loop========================================
// ======================================================================
// TODO 2
//คำสั่ง 1 ให้แสดงผลลัพธ์ดังนี้
// ===============
// รอบที่ 1 Hello World
// รอบที่ 2 Hello World
// รอบที่ 3 Hello World
// รอบที่ 4 Hello World
// รอบที่ 5 Hello World
        System.out.println("TODO 2 - For Loop");
        for (int j = 1; j <= 5; j++) {
            System.out.println("รอบที่ " + j + " Hollo World");
        }

        System.out.println("-------------------------------------------- ");

        System.out.println("TODO 2 - While Loop");
        int n2 = 1;
        while (n2 <= 5) {
            System.out.println("รอบที่ " + n2 + " Hollo World");
            n2++;
        }
        System.out.println("============================================ ");

        // ============================TODO 1 End While Loop========================================
// ======================================================================
//คำสั่ง 2 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 2 3 4 5 6 7 8 9 10
// TODO 3
        for (int j = 1; j <= 10; j++) {
            System.out.print(j + " ");
        }
// ======================================================================
//คำสั่ง 2.1 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 2 3 4 5 6 7 8 9 10 = 55
// TODO 4
        System.out.println("");
        int sum = 0;
        for (int j = 1; j <= 10; j++) {

            sum = sum + j;   //sum += j;
            System.out.print(j + " ");
        }
        System.out.print("= " + sum);
// ======================================================================
//คำสั่ง 2.2 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1+2+3+4+5+6+7+8+9+10 = 55
// TODO 5
        System.out.println("");
        sum = 0;
        for (int j = 1; j <= 10; j++) {

            sum = sum + j;   //sum += j;
            System.out.print(j + "");
            if (j <= 9) {
                System.out.print("+");
            }

        }
        System.out.print(" = " + sum);
// ======================================================================
//คำสั่ง 3 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 10 9 8 7 6 5 4 3 2 1
// TODO 6
        System.out.println("");
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
// ======================================================================
//คำสั่ง 4 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 3 5 7 9 11 13 15 17 19
// TODO 7
        System.out.println("");

        for (int j = 1; j <= 19; j += 2) {  //j=j+2 

            System.out.print(j + " ");
        }
// ======================================================================
//คำสั่ง 5 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 2 4 6 8 10 12 14 16 18 20
// TODO 8
        System.out.println("");
        System.out.println("TODO 8 - For Loop");

        for (int j = 2; j <= 20; j += 2) {  //j=j+2 

            System.out.print(j + " ");
        }
        System.out.println("\n-------------------------------------------- ");
        System.out.println("TODO 8 - while Loop");
        int n8 = 2;
        while (n8 <= 20) {
            System.out.print(n8 + " ");
            n8 += 2;
        }
        System.out.println("\n============================================ ");

// ======================================================================
//คำสั่ง 6 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 4 9 16 25 36 49 64 81 100
// TODO 9
        System.out.println("");

        for (int j = 1; j <= 10; j++) {

            System.out.print(j * j + " ");
        }
        System.out.println("\n============================================ ");
// ======================================================================

// TODO 10
//คำสั่ง 7 ให้แสดงผลลัพธ์ดังนี้
// ===============
// รอบที่ 1 เลขคี่
// รอบที่ 2 เลขคู่
// รอบที่ 3 เลขคี่
// รอบที่ 4 เลขคู่
// รอบที่ 5 เลขคี่
        System.out.println("");

        System.out.println("TODO 10 - For Loop");

        for (int n10 = 1; n10 <= 5; n10++) {

            if (n10 % 2 == 1) {
                System.out.println("รอบที่ " + n10 + " เลขคี่");

            } else {

                System.out.println("รอบที่ " + n10 + " เลขคู่");

            }
        }
        System.out.println("-------------------------------------------- ");

        System.out.println("TODO 10 - While Loop");
        int n10 = 1;
        while (n10 <= 5) {

            if (n10 % 2 == 1) {
                System.out.println("รอบที่ " + n10 + " เลขคี่");

            } else {

                System.out.println("รอบที่ " + n10 + " เลขคู่");

            }
            n10++;
        }
        System.out.println("============================================ ");
// ======================================================================
    }
}
