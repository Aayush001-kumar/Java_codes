import java.util.Scanner;

public class Q54_index_printing {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int[] array;
        int n, x, i;
        System.out.println("Enter the number of elements");
        n = Sc.nextInt();
        array = new int[n];
        System.out.println("Enter " + n + " elements");
        for (i = 0; i < n; i++) {
            array[i] = Sc.nextInt();
        }
        System.out.println("Enter the element whose position you need to find:");
        x = Sc.nextInt();
        Q54_index_printing obj = new Q54_index_printing();
        int index = obj.logic(x, array, n, i);
        if(index==i) {
            System.out.println(x + " not found in the array.");
        }
        else {
            System.out.println(x + " found at position " + index+1);
        }
        Sc.close();

    }

    int logic(int x, int[] array, int n, int i) {
        for (i = 0; i < n; i++) {
            if (array[i] == x) {
                return i;
            }
        }
        return -1;
    }
}