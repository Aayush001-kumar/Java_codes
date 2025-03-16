import java.util.Scanner;

public class Q57_transpose_of_the_given_matrix {
    Scanner matrixInput = new Scanner(System.in);
    int row,column;
    int[][] matrix;
    int[][] transpose;

    void frist(){
        System.out.println("Enter the number of rows:");
        row = matrixInput.nextInt();
        System.out.println("Enter the number of columns:");
        column = matrixInput.nextInt();
        matrix = new int[row][column];
        transpose = new int[column][row];
    }

    void input(){
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = matrixInput.nextInt();
            }
        }
    }
    void logic(){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
    }
    void output(){
        System.out.println("The transpose of the given matrix is:");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Q57_transpose_of_the_given_matrix obj=new Q57_transpose_of_the_given_matrix();
        obj.frist();
        obj.input();
        obj.logic();
        obj.output();
    }
}
