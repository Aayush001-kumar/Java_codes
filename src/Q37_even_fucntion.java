import java.util.Scanner;

public class Q37_even_fucntion {
    Scanner sc = new Scanner(System.in);
    int num;

    void input() {
        System.out.println("Enter a number: ");
        num = sc.nextInt();
    }

    void display() {

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Q37_even_fucntion obj = new Q37_even_fucntion();
        obj.input();
        obj.display();
    }
}