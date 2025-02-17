import java.util.Scanner;

public class Q49_array_name {
    Scanner Sc=new Scanner(System.in);
    int n,i,element,occur=0;
    String[] array;
    void first(){
        System.out.println("Enter the number of names");
        n= Sc.nextInt();
        array = new String[n];
    }
    void input() {
        System.out.println("Enter " + n + " names");
        for (int i = 0; i < n; i++) {
            array[i] = Sc.next();
        }
    }
    void output(){
        System.out.println("The Entered names are");
        for(int i=0;i<=n-1;i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args) {
        Q49_array_name object=new Q49_array_name();
        object.first();
        object.input();
        object.output();
    }
}
