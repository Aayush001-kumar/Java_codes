import java.util.Arrays;
import java.util.Scanner;

public class Q48_sorting_of_array {
    Scanner Sc=new Scanner(System.in);
    int n;
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
        Arrays.sort(array);
    }
    void output(){
        System.out.println("Sorted array in ascending order is " +Arrays.toString(array));
    }

    public static void main(String[] args) {
        Q48_sorting_of_array obj=new Q48_sorting_of_array();
        obj.first();
        obj.input();
        obj.logic();
        obj.output();
    }
}
