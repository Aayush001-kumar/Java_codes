import java.util.Scanner;

public class Q40_greater_2_function {
    Scanner sc = new Scanner(System.in);
    int num1, num2;

    void input() {
        System.out.println("Enter 2 numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
    }

    void check() {

        int result = (num1 > num2) ? num1 : num2;
        System.out.println("Greater number is: " + result);
    }

    public static void main(String[] args) {
        Q40_greater_2_function obj = new Q40_greater_2_function();
        obj.input();
        obj.check();
    }
}