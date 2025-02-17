import java.util.Scanner;

public class Q52_average_of_elements {
    Scanner Sc=new Scanner(System.in);
    int n,sum=0;;
    int[] array;
    void first(){
        System.out.println("Enter the number of elements");
        n= Sc.nextInt();
        array = new int[n];
    }
    void input() {
        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            array[i] = Sc.nextInt();
        }
    }
    void logic(){
        for(int i=0;i<=n-1;i++){
            sum+=array[i];
        }
    }
    void  output(){
        System.out.print("Average of the entered elements is "+sum/n);
    }

    public static void main(String[] args) {
        Q52_average_of_elements obj=new Q52_average_of_elements();
        obj.first();
        obj.input();
        obj.logic();
        obj.output();
    }
}
