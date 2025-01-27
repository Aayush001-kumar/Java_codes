import java.util.Scanner;

public class Q5_Simple_intrest {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.print("Enter your Principal Interest = ");
        float pri_inter = Sc.nextFloat();
        System.out.print("Enter your interest rate = ");
        float rate = Sc.nextFloat();
        System.out.print("Enter your time (in years) = ");
        float time = Sc.nextFloat();

        float SI = ((pri_inter*rate*time)/100);
        float final_amt = pri_inter+SI;

        System.out.println("Simple Interest = "+SI);
        System.out.print("Final amount to pay to bank = " +final_amt);
        Sc.close();
    }
}
