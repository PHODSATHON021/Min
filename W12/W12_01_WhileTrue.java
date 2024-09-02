package W12;

public class W12_01_WhileTrue {

    public static void main(String[] args) {

        int i = 0;        // กำหนดค่าเริ่มต้น
        while (true) {    // วนลูปไปเรื่อยๆ 
            i++;          // แสดงค่า i
            System.out.print(i + " ");// แสดงข้อความพร้อมกับค่า count
            //เพิ่มค่า iทีละ 1       // update รอบ
            if (i >= 1000) {     // ตรวจสอบเงื่อนไข ถ้ารอบมากกว่าหรือเท่ากับ 1000 ให้ออกจากลูป
                break;           // ออกจากลูป

            }
          
            
            
        } 
    }
}
