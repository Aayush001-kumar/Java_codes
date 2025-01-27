import java.util.Scanner;

public class Q17_pass_or_fail {
    public static void main(String[] args) {
        Scanner Result = new Scanner(System.in);

        System.out.println("Enter your Percentage ");
        byte marks = Result.nextByte();

        if (marks < 100) {
            if (marks > 40) {
                System.out.println("Congratulations you have passed your Examination");
            } else {
                System.out.println("Sorry you have failed your examination by " + (40 - marks) + "%");
                System.out.println("Don't be sad you can appear for BACK EXAMINATIONS");
                System.out.println("For more info contact Admin office");
            }
        } else {
            System.out.println("Please enter a valid input");
        }
        Result.close();
    }
}