import java.util.Scanner;

public class Q28_square_cube_using_function {
    Scanner Sc=new Scanner(System.in);
    int num,square,cube;
    void in(){
        System.out.println("Enter your value");
        num=Sc.nextInt();
    }
    void out(){
        System.out.println("Square of the vale = "+square);
        System.out.print("Cube of the value = "+cube);
    }
    void logic(){
        square=num*num;
        cube=num*num*num;
    }

    public static void main(String[] args) {
        Q28_square_cube_using_function obj=new Q28_square_cube_using_function();
        obj.in();
        obj.logic();
        obj.out();
    }
}
