//  6) แสดงรายการพัสดุ พร้อมทั้งบอกว่ามาจากไทยหรือต่างประเทศ
// มีแสดงจำนวนพัสดุทั้งหมดเท่าไหร่
// มีจำนวนพัสดุที่มาจากไทยเท่าไหร่
// มีจำนวนพัสดุที่มาจากต่างประเทศเท่าไหร่
package W14;

public class W14_Homework_Array {

    public static void main(String[] args) {

        String[] codes = {"123TH", "124EN", "125EN", "126TH", "127EN"};

        //แสดงรายการพัสดุ พร้อมทั้งบอกว่ามาจากไทยหรือต่างประเทศ
        System.out.println("รายการพัสดุ");
        int codesTH = 0;
        for (int i = 0; i < codes.length; i++) {
            if (codes[i].endsWith("TH")) {
                System.out.println((i + 1) + codes[i] + " มาจากไทย");
                codesTH++;
            } else {
                System.out.println((i + 1) + codes[i] + " มาจากต่างประเทศ");
                
            }
        }

        System.out.println("====================================");

        // มีแสดงจำนวนพัสดุทั้งหมดเท่าไหร่
        System.out.println("จำนวนพัสดุทั้งหมด" + " " + codes.length+ " ชิ้น");

        System.out.println("====================================");

        // มีจำนวนพัสดุที่มาจากไทยเท่าไหร่
          System.out.println("จำนวนพัสดุไทย" + " " + codesTH+ " ชิ้น");

        System.out.println("====================================");
        // มีจำนวนพัสดุที่มาจากต่างประเทศเท่าไหร่
        System.out.println("พัสดุที่มาจากต่างประเทศทั้งหมด"+ (codes.length-codesTH)+ " ชิ้น");
        System.out.println("====================================");
        }
        
    }
