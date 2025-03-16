import java.util.Scanner;

public class Challenge_Program_2 {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        int number,revers=0,newValue = 0,printingValue;
        System.out.println("Please enter the number which you want to revers ");
        number=value.nextInt();
        printingValue=logic(number,revers,newValue);
        System.out.println(printingValue);
        value.close();

    }
    public static int logic (int number, int revers, int newValue){
        while(number != 0){
            newValue=number%10;
            revers=revers*10+newValue;
            number/=10;
        }
        return revers;
    }
}
