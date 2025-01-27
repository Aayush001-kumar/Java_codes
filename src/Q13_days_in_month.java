import java.util.Scanner;

public class Q13_days_in_month {
    public static void main(String[] args) {
        Scanner months =new Scanner(System.in);
        System.out.println("Enter number of days ");
        int days= months.nextInt();

        System.out.println(""+(days/30)+" months" + " and"+" "+(days%30) + " days");
    }
}
