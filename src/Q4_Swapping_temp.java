import java.util.Scanner;

public class Q4_Swapping_temp {
    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
        System.out.print("Enter value of a = ");
        int a=Sc.nextInt();
        System.out.print("Enter value of b = ");
        int b=Sc.nextInt();
        int c= a;
        a=b;
        b=c;
        System.out.println("After swapping of two numbers");
        System.out.println("a = " +a + "\nb = "+b);
        Sc.close();

    }
}
