import java.util.Scanner;

public class W04_02_ifElse_compareNumber {
    public static void main(String[] args) {
        // สร้างแป้นพิม
        Scanner input = new Scanner(System.in);

        // กำหนดค่า Num1
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        // กำหนดค่า Num2
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        int result = 0;

        if (num1 > num2) {
            result = num1 - num2;
            System.out.println("The number " + num1 + " is greater than the number " + num2);
        } else {
            result = num1 + num2;
            System.out.println("The number " + num1 + " is less than or the number " + num2);

            
        }

        }

    }


