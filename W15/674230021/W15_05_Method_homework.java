
import java.util.Scanner;
public class W15_05_Method_homework {

    static int calculate(int factorial){
int num = 1;
System.out.print("Factorial for "+ factorial+" is ");
for(int i= 1 ; i <= factorial; i++) {
    System.out.print(i);
    if(i < factorial) {
        System.out.print(" x "  );
    }else{
        System.out.print(" = ");
    }
    num = num * i;
       }
       factorial = num ;
       return factorial;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter Number ");
        int factorial = kb.nextInt();
        System.out.println(calculate(factorial));
    }
}