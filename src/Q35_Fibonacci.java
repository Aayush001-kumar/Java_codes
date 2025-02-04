import java.util.Scanner;

public class Q35_Fibonacci {
    Scanner sc = new Scanner(System.in);
    int num;

    void input() {
        System.out.println("Enter a number: ");
        num = sc.nextInt();
    }

    void display() {
        int a = 0, b = 1, c;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < num; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Q35_Fibonacci obj = new Q35_Fibonacci();
        obj.input();
        obj.display();
    }

}