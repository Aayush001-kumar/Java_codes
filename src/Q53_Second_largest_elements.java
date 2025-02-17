import java.util.Scanner;

public class Q53_Second_largest_elements {
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
        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < n; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }

        if (secondLargest == 0) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }

    public static void main(String[] args) {
        Q53_Second_largest_elements obj=new Q53_Second_largest_elements();
        obj.first();
        obj.input();
        obj.logic();
    }
}
