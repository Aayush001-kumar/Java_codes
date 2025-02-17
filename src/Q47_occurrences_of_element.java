import java.util.Scanner;

public class Q47_occurrences_of_element {
    Scanner Sc=new Scanner(System.in);
    int n,i,element,occur=0;
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
    void logic() {
        System.out.println("Enter the element to count");
        element = Sc.nextInt();
        for (i = 0; i <= n - 1; i++) {
            if (array[i] == element) occur++;
        }
    }
    void output(){
        System.out.println("The "+element+" occurs "+occur+" times");
    }

    public static void main(String[] args) {
        Q47_occurrences_of_element obj=new Q47_occurrences_of_element();
        obj.first();
        obj.input();
        obj.logic();
        obj.output();
    }
}
