import java.util.Scanner;

public class Q51_negative_replacing_1d_array {
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
        for(int i=0;i<=n-1;i++) {
            if (array[i]<0){
                array[i]=0;
            }
        }
        for(int i=0;i<=n-1;i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args) {
        Q51_negative_replacing_1d_array object=new Q51_negative_replacing_1d_array();
        object.first();
        object.input();
        object.logic();
    }
}
