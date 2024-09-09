package W13;

public class W13_03_Array_CountOddEven {

    public static void main(String[] args) {
        // ให้นับจำนวนเลขคู่และเลขคี่ใน array ด้านล่าง

        int[] numbers = {1, 5, 6, 7, 9, 12, 14, 17, 18, 25, 36, 69, 58, 47, 99};

        int countOdd = 0;
        int countEven = 0;

        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            if (numbers[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }

        }
        System.out.print("\n Amount of all Number : " + numbers.length);
        System.out.print("\n Amount of Odd Number : " + countOdd);
        System.out.print("\n Amount of Even Number : " + countEven);
    }
}
