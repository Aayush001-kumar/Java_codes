import java.util.Scanner;

public class Q56_add_of_two_matrix {
    Scanner matrixAdd = new Scanner(System.in);
    int row, column;
    int[][] matrix_1;
    int[][] matrix_2;

    void input_1() {
        System.out.println("Enter the number of rows");
        row = matrixAdd.nextInt();
        System.out.println("Enter the number of columns");
        column = matrixAdd.nextInt();
        matrix_1 = new int[row][column];
        System.out.println("Enter the values for the 1st matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix_1[i][j] = matrixAdd.nextInt();
            }
        }
    }

    void input_2() {
        matrix_2 = new int[row][column];
        System.out.println("Enter the values for the 2nd matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix_2[i][j] = matrixAdd.nextInt();
            }
        }
    }

    void output() {
        System.out.println("The resulting matrix after adding the previous two matrices is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(" " + (matrix_1[i][j] + matrix_2[i][j]));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q56_add_of_two_matrix matrixPrinting = new Q56_add_of_two_matrix();
        matrixPrinting.input_1();
        matrixPrinting.input_2();
        matrixPrinting.output();
    }
}
