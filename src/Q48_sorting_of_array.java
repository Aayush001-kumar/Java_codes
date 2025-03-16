import java.util.*;

public class Q48_sorting_of_array {
    Scanner Sc=new Scanner(System.in);
    int n;
    int[] array;
    int[] cloneArray;
    void first(){
        System.out.println("Enter the number of elements");
        n= Sc.nextInt();
        array = new int[n];
        cloneArray=new int[n];
    }
    void input() {
        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            array[i] = Sc.nextInt();
            cloneArray[i]=array[i];
        }
    }
    void ascendingLogic(){
        for(int i=0;i<=n-1;i++){
            for(int j=i+1;j<=n-1;j++){
                if(array[i]>array[j]){
                    array[i]=array[i]+array[j];
                    array[j]=array[i]-array[j];
                    array[i]=array[i]-array[j];
                }
            }
        }
    }
    void descendingLogic(){
        for(int i=0;i<=n-1;i++){
            for(int j=i+1;j<=n-1;j++){
                if(cloneArray[i]<cloneArray[j]){
                    cloneArray[i]=cloneArray[i]+cloneArray[j];
                    cloneArray[j]=cloneArray[i]-cloneArray[j];
                    cloneArray[i]=cloneArray[i]-cloneArray[j];
                }
            }
        }
    }

    void output(){
        System.out.println("Sorted array in ascending order is ");
        for (int i=0;i<=n-1;i++){
            System.out.println(array[i]+" ");
        }
        System.out.println("Sorted array in descending order is ");
        for (int i=0;i<=n-1;i++){
            System.out.println(cloneArray[i]+" ");
        }
    }

    public static void main(String[] args) {
        Q48_sorting_of_array obj=new Q48_sorting_of_array();
        obj.first();
        obj.input();
        obj.ascendingLogic();
        obj.descendingLogic();
        obj.output();
    }
}
