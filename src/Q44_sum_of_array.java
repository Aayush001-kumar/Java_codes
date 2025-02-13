import java.util.Scanner;

public class Q44_sum_of_array {
    Scanner number=new Scanner(System.in);
    int n;
    int[] array;
    void first(){
        System.out.println("Enter the number of elements");
        n= number.nextInt();
        array = new int[n];
    }

    void input() {
        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            array[i] = number.nextInt();
        }
    }

    void output() {
        System.out.println("Addition of the enter elements");
        int add=0;
        for(int i=0;i<=n-1;i++){
            add+=array[i];
        }
        System.out.println(add);
    }

    public static void main(String[] args) {
        Q44_sum_of_array obj=new Q44_sum_of_array();
        obj.first();
        obj.input();
        obj.output();
    }
}
