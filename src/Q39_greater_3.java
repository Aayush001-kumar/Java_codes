
import java.util.Scanner;

public class Q39_greater_3 {
    Scanner sc = new Scanner(System.in);
    int num1, num2, num3;

    void input() {
        System.out.println("Enter 3 numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
    }

    void display() {
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is greater.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is greater.");
        } else {
            System.out.println(num3 + " is greater.");
        }
    }

    public static void main(String[] args) {
        Q39_greater_3 obj = new Q39_greater_3();
        obj.input();
        obj.display();
    }
}