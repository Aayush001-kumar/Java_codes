import java.util.Scanner;

public class Q20_Capital_or_small {
    public static void main(String[] args) {
        Scanner letter = new Scanner(System.in);

        System.out.println("Enter your Alphabet");
        char alpha = letter.next().charAt(0);
        if (alpha >= 'A' && alpha <= 'Z') {
            System.out.println("Given Alphabet is Capital");
        } else if (alpha >= 'a' && alpha <= 'z') {
            System.out.println("Given Alphabet is Small");
        } else {
            System.out.println("Please enter a valid Alphabet");
        }
        letter.close();
    }
}