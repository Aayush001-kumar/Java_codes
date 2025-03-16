import java.util.Scanner;

public class Q55_2d_array {
    Scanner matrix=new Scanner(System.in);
    int row,column;
    int[][] array;
    void first(){
        System.out.println("Enter the number of rows");
        row=matrix.nextInt();
        System.out.println("Enter the number of column");
        column=matrix.nextInt();
        array = new int[row][column];
    }
    void input(){
        System.out.println("Enter the values of rows");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++) {
                array[i][j] = matrix.nextInt();
            }
        }
    }
    void output(){
        for(int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q55_2d_array object =new Q55_2d_array();
        object.first();
        object.input();
        object.output();
    }

}
