import java.util.Scanner;

public class Q16_vote {
    public static void main(String[] args) {
        Scanner vote = new Scanner(System.in);
        System.out.println("Enter your age ");
        byte age = vote.nextByte();
        if (age > 18) {
            System.out.println("Congratulations you are Eligible to vote");
        }
        else {
            System.out.println("Sorry you are not Eligible for voting");
            System.out.println("You have to wait for "+(18-age)+"years");
        }
        vote.close();
    }
}