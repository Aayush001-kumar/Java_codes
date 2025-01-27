import java.util.Scanner;

public class Q19_odd_even {
    public static void main(String[] args) {
        Scanner number =new Scanner(System.in);

        System.out.println("Enter your number");
        int value = number.nextInt();
        if (value % 2 == 0) {
            System.out.print("" + (value) + " is even number");
        } else {
            System.out.print("" +(value) + " is odd number");
        }
        number.close();
    }
}
