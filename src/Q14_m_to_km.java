import java.util.Scanner;

public class Q14_m_to_km {
    public static void main(String[] args) {
        Scanner unit = new Scanner(System.in);
        System.out.println("Enter the value in meter");
        float meter = unit.nextFloat();

        System.out.println("" + meter + " m" + " = " + "" + (meter / 1000) + " km");
        unit.close();
    }
}