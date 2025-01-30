import java.util.Scanner;

public class Q27_swaping_using_function {
    Scanner swap=new Scanner(System.in);
    int num1,num2;
    void input(){
        System.out.println("Enter your value of a");
        num1= swap.nextInt();
        System.out.println("Enter your value of b");
        num2= swap.nextInt();
    }
    void output(){
        System.out.println("Value of a after swapping "+num1);
        System.out.print("Value of b after swapping "+num2);
    }
    void swap(){
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
    }

    public static void main(String[] args) {
        Q27_swaping_using_function object=new Q27_swaping_using_function();
        object.input();
        object.swap();
        object.output();
    }
}
