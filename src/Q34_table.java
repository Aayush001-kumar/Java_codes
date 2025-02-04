import java.util.Scanner;

public class Q34_table {
    Scanner sc = new Scanner(System.in);
    int num;

    void input() {
        System.out.println("Enter a number: ");
        num = sc.nextInt();
    }

    void display() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }

    public static void main(String[] args) {
        Q34_table obj = new Q34_table();
        obj.input();
        obj.display();
    }

}