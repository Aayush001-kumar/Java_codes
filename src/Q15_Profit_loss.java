import java.util.Scanner;

public class Q15_Profit_loss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Cost Price: ");
        int costPrice = scanner.nextInt();

        System.out.print("Enter the Selling Price: ");
        int sellingPrice = scanner.nextInt();
        if (sellingPrice > costPrice) {
            int profit = sellingPrice - costPrice;
            System.out.println("Profit: " + profit);
        } else if (costPrice > sellingPrice) {
            int loss = costPrice - sellingPrice;
            System.out.println("Loss: " + loss);
        } else {
            System.out.println("No Profit, No Loss.");
        }
    }
}