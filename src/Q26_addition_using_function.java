import java.util.Scanner;

public class Q26_addition_using_function {
    Scanner Sc= new Scanner(System.in);
    int num1,num2,sum;
    void input()
    {
        System.out.println("Enter first value");
        num1=Sc.nextInt();
        System.out.println("Enter second value");
        num2=Sc.nextInt();
    }
    void output(){
        System.out.print("Addition = "+sum);
    }
    void add(){
        sum=num1+num2;
    }

    public static void main(String[] args) {
        Q26_addition_using_function obj =new Q26_addition_using_function();
        obj.input();
        obj.add();
        obj.output();

    }

}
