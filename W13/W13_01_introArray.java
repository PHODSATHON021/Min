package W13;

public class W13_01_introArray {

    public static void main(String[] args) {
        // ประกาศตัวแปรชนิด Array แบบที่ 1 - รู้จำนวนข้อมูลล่วงหน้า
        String[] colors = {"Purple", "Cyan", "Blue", "Green", "Yellow", "Orange", "Red"};
        int[] banks = {20, 50, 100, 500, 1000};
        char[] alfabets = {'a', 'b', 'c', 'd', 'e'};

        // แสดงผลลัพธ์โช้ index ของ Array
        System.out.println("The first color is " + colors[2]);
        System.out.println("The Third  alfabets is " + alfabets[2]);

        // แสดงผลโดยใช้ Loop
        System.out.println("Colors in the array are: ");
        for (int i = 6; i >= 0; i--) {
            System.out.print(colors[i] + " ");
        }

        System.out.println("\n================================================================");
        for (int i = 0; i < 6; i++) {
            System.out.print(colors[i] + " ");
        }
        System.out.println("\n================================================================= ");
        System.out.println("Banks in array are: ");
        for (int i = 0; i < banks.length; i++) {  //ใช้ .lengrth ในการหาขนาดของ Array
            System.out.print(banks[i] + " ");
        }
        System.out.println("\n================================================================= ");
    }
}
