import java.util.Scanner;

public class Q43_reverse_order {
    Scanner number = new Scanner(System.in);
    int n;
    int[] array;

    void first() {
        System.out.println("Enter the number of elements");
        n = number.nextInt();
        array = new int[n]; // Initialize the array here
    }

    void input() {
        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            array[i] = number.nextInt(); // Use nextInt() to read each element
        }
    }

    void reverse() {
        int temp;
        for (int i = 0; i < n / 2; i++) {
            temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }
    }

    void output() {
        System.out.println("The Entered elements in reverse order are");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        Q43_reverse_order object = new Q43_reverse_order(); // Use the correct class name
        object.first();
        object.input();
        object.reverse();
        object.output();
    }
}
