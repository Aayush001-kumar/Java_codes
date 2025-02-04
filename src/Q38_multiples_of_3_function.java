import java.util.Scanner;

public class Q38_multiples_of_3_function {
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
        Q38_multiples_of_3_function obj = new Q38_multiples_of_3_function();
        obj.input();
        obj.print();
    }
}