import java.util.Scanner;

public class Q38 {
    Scanner sc = new Scanner(System.in);
    int num;

    void input() {
        System.out.println("Enter a number: ");
        num = sc.nextInt();
    }

    void print() {
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Q38 obj = new Q38();
        obj.input();
        obj.print();
    }
}