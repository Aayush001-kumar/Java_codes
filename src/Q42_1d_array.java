import java.util.Scanner;

public class Q42_1d_array {
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

    void output(){
        System.out.println("The Entered elements are");
        for(int i=0;i<=n-1;i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args) {
        Q42_1d_array object=new Q42_1d_array();
        object.first();
        object.input();
        object.output();

    }
}
