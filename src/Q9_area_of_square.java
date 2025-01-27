import java.util.Scanner;

public class Q9_area_of_square {
    public static void main(String[] args) {
        Scanner area =new Scanner(System.in);
        System.out.println("Enter the side of the square = ");
        float side = area.nextFloat();
        System.out.println("Area of the Square is = "+(side*side));
        area.close();
    }
}
