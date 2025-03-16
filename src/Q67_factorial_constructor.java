import java.util.Scanner;

public class Q67_factorial_constructor {
    Scanner sc =new Scanner(System.in);
    long num,factorial=1;
    Q67_factorial_constructor(){
        System.out.println("Enter the number of which you want to know the factorial");
        num=sc.nextLong();
    }
    void logic(){
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
    }
    void output(){
        System.out.println("The factorial of "+num+" is");
        System.out.println(num+"!"+" = "+factorial);
    }

    public static void main(String[] args) {
        Q67_factorial_constructor object=new Q67_factorial_constructor();
        object.logic();
        object.output();
    }
}
