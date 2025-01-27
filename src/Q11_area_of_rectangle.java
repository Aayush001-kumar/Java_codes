import java.util.Scanner;

public class Q11_area_of_rectangle {
    public static void main(String[] args) {
        Scanner area =new Scanner(System.in);
        System.out.println("Enter length of the rectangle ");
        float length = area.nextFloat();
        System.out.println("Enter width of the rectangle ");
        float width = area.nextFloat();
        System.out.print("Area of the rectangle = "+(length*width));
        area.close();
    }
}
