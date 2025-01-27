import java.util.Scanner;

public class Q18_Positive_or_negative {
    public static void main(String[] args) {
        Scanner number =new Scanner(System.in);
        System.out.println("Enter your value");
        int value = number.nextInt();
        if(value>0){
            System.out.println("Given value is positive");
        } else if (value==0) {
            System.out.println("Given value is Zero");
        }
        else{
            System.out.println("Given vale is Negative");
        }
        number.close();
    }
}
