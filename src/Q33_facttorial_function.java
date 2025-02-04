import java.util.Scanner;

public class Q33_facttorial_function {
    Scanner sc = new Scanner(System.in);
    int num, fact = 1;

    void input() {
        System.out.println("Enter a number: ");
        num = sc.nextInt();
    }

    void calculate() {
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
    }

    void display() {
        System.out.println("Factorial of " + num + " is: " + fact);
    }

    public static void main(String[] args) {
        Q33_facttorial_function obj = new Q33_facttorial_function();
        obj.input();
        obj.calculate();
        obj.display();
    }
}