import java.util.Scanner;

public class Q8_area_of_circle {
    public static void main(String[] args) {
        Scanner radi = new Scanner(System.in);
        System.out.println("enter area of radius");
        float radius;
        radius=radi.nextFloat();

        System.out.println("area of circle = "+(3.14f*radius*radius));

        radi.close();
    }
}
