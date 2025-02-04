import java.util.Scanner;

public class Q32_cost_sale_function {
    Scanner sc = new Scanner(System.in);
    int cost, sale, profit;

    void input() {
        System.out.println("Enter cost price: ");
        cost = sc.nextInt();
        System.out.println("Enter sale price: ");
        sale = sc.nextInt();
    }

    void calculate() {
        profit = sale - cost;
    }

    void display() {
        if (profit > 0) {
            System.out.println("You have made a profit of: " + profit);
        } else if (profit < 0) {
            System.out.println("You have made a loss of: " + profit);
        } else {
            System.out.println("You have neither made a profit nor a loss");
        }
    }

    public static void main(String[] args) {
        Q32_cost_sale_function obj = new Q32_cost_sale_function();
        obj.input();
        obj.calculate();
        obj.display();
    }
}