import java.util.Scanner;

public class Q7_F_to_C {
    public static void main(String[] args) {
        Scanner temp=new Scanner(System.in);
        System.out.println("Enter your  temperature in Fahrenheit");
        float F = temp.nextFloat();
        System.out.println("Your temperature in Celsius is "+((F-32.0)*(5.0/9.0)));
        temp.close();
    }
}
