import java.util.Scanner;

public class Q21_leap_year {
    public static void main(String[] args) {
        Scanner leap=new Scanner(System.in);

        System.out.println("Enter your year (YYYY)");
        int year= leap.nextInt();
        if(year%4==0){
            System.out.println(""+(year)+" is a leap year");
        }
        else{
            System.out.println(""+year+" is not a leap year");
        }
        leap.close();
    }
}
