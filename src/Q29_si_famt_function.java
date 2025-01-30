import java.util.Scanner;

public class Q29_si_famt_function {
    Scanner bank =new Scanner(System.in);
    float p_amt,rate,time,si,f_amt;
    void in (){
        System.out.print("Enter your principal amount = ");
        p_amt=bank.nextInt();
        System.out.print("Enter your rate of interest = ");
        rate=bank.nextInt();
        System.out.println("Enter your time in years ");
        time= bank.nextInt();
    }
    void logic(){
        si=(p_amt*rate*time)/100;
        f_amt=si+p_amt;
    }
    void out(){
        System.out.println("Your simple interest is = " +si);
        System.out.println("Your final amount tot pay to bank is = "+f_amt);
    }

    public static void main(String[] args) {
        Q29_si_famt_function obj=new Q29_si_famt_function();
        obj.in();
        obj.logic();
        obj.out();
    }
}
