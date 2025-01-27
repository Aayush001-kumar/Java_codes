import java.util.Scanner;

public class Q3_operation_of_two_numbers {
    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
        System.out.println("Enter any two number ");
        float num1,num2;
        num1=Sc.nextFloat();
        num2=Sc.nextFloat();

        System.out.println("Sum = " +(num1+num2));
        System.out.println("Diffrence = " +(num1-num2));
        System.out.println("Multiplication = " +(num1*num2));
        System.out.println("Division = "+(num1/num2));

        Sc.close();
    }
}
