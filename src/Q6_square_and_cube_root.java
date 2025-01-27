import java.util.Scanner;

public class Q6_square_and_cube_root {
    public static void main(String[] args) {
        Scanner root=new Scanner(System.in);
        System.out.println("Enter the any value = ");
        float num = root.nextFloat();
        System.out.print("The square root = "+(num*num));
        System.out.println("The cube root = "+(num*num*num));
        root.close();
    }
}
