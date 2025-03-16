import java.util.*;

public class Challenge_question_mdp_1d_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, n;
        int[] array;

        while (true) {
            System.out.println("Select the 1D array operations");
            System.out.println("Press 1 to Find Minimum Array element");
            System.out.println("Press 2 to Find Maximum Array element");
            System.out.println("Press 3 for Sorted Array");
            System.out.println("Press 4 to Find Sum of All Elements");
            System.out.println("Press 5 to Find Average of Array element");
            System.out.println("Press 6 to Exit");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 5) {
                System.out.print("Enter the number of elements: ");
                n = sc.nextInt();
                array = new int[n];

                System.out.println("Enter " + n + " elements:");
                for (int i = 0; i < n; i++) {
                    array[i] = sc.nextInt();
                }

                switch (choice) {
                    case 1:
                        findMinimum(array);
                        break;
                    case 2:
                        findMaximum(array);
                        break;
                    case 3:
                        sortArray(array);
                        break;
                    case 4:
                        findSum(array);
                        break;
                    case 5:
                        findAverage(array);
                        break;
                }
            } else if (choice == 6) {
                System.out.println("Exiting...");
                break; // Exit the loop
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }

    public static void findMinimum(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Minimum element: " + min);
        System.out.println();
    }

    public static void findMaximum(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Maximum element: " + max);
        System.out.println();
    }

    public static void sortArray(int[] array) {
        Arrays.sort(array);
        System.out.print("Sorted array: ");
        System.out.print(" " + Arrays.toString(array));
        System.out.println("\n");
    }

    public static void findSum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        System.out.println("Sum of all elements: " + sum);
        System.out.println();
    }

    public static void findAverage(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        double average = (double) sum / array.length;
        System.out.println("Average of elements: " + average);
        System.out.println();
    }
}
