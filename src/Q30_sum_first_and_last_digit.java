import java.util.Scanner;

public class  Q30_sum_first_and_last_digit{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a four-digit number: ");
        int num = scanner.nextInt();

        int firstDigit = num / 1000;
        int lastDigit = num % 10;
        int sum = firstDigit + lastDigit;
        System.out.println("The sum of the first and last digit is: " + sum);
        scanner.close();
    }
}
