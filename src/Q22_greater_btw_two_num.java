import java.util.Scanner;

public class Q22_greater_btw_two_num {
    public static void main(String[] args) {
        Scanner GreaterNum=new Scanner(System.in);

        System.out.println("Enter first value");
        int num1= GreaterNum.nextInt();
        System.out.println("Enter your 2nd value");
        int num2= GreaterNum.nextInt();
        if(num1>num2){
            System.out.println(""+num1+" is greater than "+""+num2);
        } else if (num1==num2) {
            System.out.println("gavar sale \uD83E\uDD72");
        } else {
            System.out.println(""+num2+" is greater than "+""+num1);
        }
        GreaterNum.close();
    }
}
