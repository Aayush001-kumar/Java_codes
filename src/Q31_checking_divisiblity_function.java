import java.util.Scanner;

public class Q31_checking_divisiblity_function {
    Scanner check =new Scanner(System.in);
    int num,div;
    void in(){
        System.out.println("Enter the value");
        num=check.nextInt();
        System.out.println("Enter the value you want to check divisiblity");
        div= check.nextInt();
    }
    void logic(){
        if(div%num!=0){
            System.out.println("Yes "+""+num+" is divisible by "+""+div);
        }
        else{
            System.out.println("NO "+""+num+" is divisible by "+""+div);
        }
    }
    public static void main(String[] args) {
        Q31_checking_divisiblity_function number=new Q31_checking_divisiblity_function();
        number.in();
        number.logic();
    }

}
