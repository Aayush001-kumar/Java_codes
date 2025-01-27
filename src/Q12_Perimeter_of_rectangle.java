import java.util.Scanner;

public class Q12_Perimeter_of_rectangle {
    public static void main(String[] args) {
        Scanner peri =new Scanner(System.in);
        System.out.print("Enter length of the rectangle = ");
        int length= peri.nextInt();
        System.out.print("Enter width of the rectangle = ");
        int width= peri.nextInt();

        System.out.print("Perimeter of the rectangle is = "+(2*(length+width)));
        peri.close();

    }
}
