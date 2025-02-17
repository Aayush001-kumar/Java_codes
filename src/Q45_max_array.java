import java.util.Scanner;

public class Q45_max_array {
    Scanner number=new Scanner(System.in);
    int n,i,max=0;
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
    void max(){
        for(i=0;i<=n-1;i++){
            if(array[i]>max) max=array[i];
        }
    }
    void output(){
        System.out.print("The maximum element is "+max+" ");
    }

    public static void main(String[] args) {
        Q45_max_array object=new Q45_max_array();
        object.first();
        object.input();
        object.max();
        object.output();
    }
}
