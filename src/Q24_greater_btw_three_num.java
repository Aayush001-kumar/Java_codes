import java.util.Scanner;

public class Q24_greater_btw_three_num {
    public static void main(String[] args) {
        Scanner greater=new Scanner(System.in);

        System.out.println("Enter your 1st number");
        int num1= greater.nextInt();
        System.out.println("Enter your 2nd number");
        int num2= greater.nextInt();
        System.out.println("Enter your 3rd number");
        int num3= greater.nextInt();

        if(num1>num2){
            if(num1>num3){
                System.out.println(num1+" is greater than"+num2+" and"+num3+"");
            } else{
                System.out.println(num3+" is greater than"+num1+" and"+num2+"");
            }
        }
        else{
            if(num2>num3){
                System.out.println(num2+" is greater than"+num1+" and"+num2+"");
            } else{
                System.out.println(num3+" is greater than"+num1+" and"+num2+"");
            }
        }
        greater.close();
    }
}
