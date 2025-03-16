import java.util.Scanner;

public class Q50_sorting_of_string {
    Scanner Sc=new Scanner(System.in);
    int n;
    String[] array;
    String[] cloneArray;
    void first(){
        System.out.println("Enter the number of elements");
        n= Sc.nextInt();
        array = new String[n];
        cloneArray=new String[n];
    }
    void input() {
        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            array[i] = Sc.nextLine();
            cloneArray[i]=array[i];
        }
    }
    void logic(){
        for(int i=1;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){

            }
        }
    }
}