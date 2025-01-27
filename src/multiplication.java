import java.util.Scanner;

public class multiplication {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter any two numbers");

        float num1,num2;

        num1=Sc.nextFloat();
        num2=Sc.nextFloat();
        System.out.print("Multiplication = "+(num1*num2));

    }
}
