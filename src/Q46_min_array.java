import java.util.Scanner;

public class Q46_min_array {
    Scanner number=new Scanner(System.in);
    int n,i,min;
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
        min=array[i];
        for(i=0;i<=n-1;i++){
            if(array[i]<min) min=array[i];
        }
    }
    void output(){
        System.out.print("The minimum element is "+min+" ");
    }

    public static void main(String[] args) {
        Q46_min_array object=new Q46_min_array();
        object.first();
        object.input();
        object.max();
        object.output();
    }
}
