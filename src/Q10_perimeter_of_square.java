import java.util.Scanner;

public class Q10_perimeter_of_square {
    public static void main(String[] args) {
        Scanner perimeter=new Scanner(System.in);
        System.out.println("Enter side of the square "); 
        float side = perimeter.nextFloat();
        System.out.print("Perimeter of the square = "+(4f*side));
        perimeter.close();

    }
}
