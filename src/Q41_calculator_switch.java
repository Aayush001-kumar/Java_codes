import java.util.Scanner;

public class Q41_calculator_switch {
    Scanner value = new Scanner(System.in);
    float num1, num2;
    void in() {
        System.out.println("Enter your first value");
        num1 = value.nextFloat();
        System.out.println("Enter your second value");
        num2 = value.nextFloat();
    }

    void sum() {
        System.out.print("Addition = " +(num1 + num2));
    }

    void sub() {
        System.out.print("Subtraction = " + (num1 - num2));
    }

    void mult() {
        System.out.print("Multiplication of = " + (num1 * num2));
    }

    void div() {
        System.out.print("Division = " + (num1 / num2));
    }
    void exit(){
        System.out.println("Exiting.....");
    }

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        Q41_calculator_switch choice = new Q41_calculator_switch();
        System.out.println("Hello to out calculator please select your desired operation");
        while (true) {
            System.out.print("A.Addition\nB.Subtraction\nC.Multiplication\nD.Division\nE.Exit");
            char userChoice = user.next().charAt(0);

            switch (userChoice) {
                case 'A':
                case 'a':
                    choice.in();
                    choice.sum();
                    break;
                case 'B':
                case 'b':
                    choice.in();
                    choice.sub();
                    break;
                case 'C':
                case 'c':
                    choice.in();
                    choice.mult();
                    break;
                case 'D':
                case 'd':
                    choice.in();
                    choice.div();
                    break;
                case'E':
                case'e':
                    choice.exit();
                   return;
                default:
                    System.out.println("Please Enter a valid input");
            }


        }


    }
}
