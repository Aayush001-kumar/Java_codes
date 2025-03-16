import java.util.Scanner;

public class Q66_Addition_using_constructors {
    Scanner number=new Scanner(System.in);
    int n;
    int[] array;
    Q66_Addition_using_constructors(){
        System.out.println("Enter the number of elements");
        n= number.nextInt();
        array = new int[n];
    }

    void input() {
        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            array[i] = number.nextInt();
            if(i<=n-2)
            System.out.println("+");
        }
    }

    void output() {
        System.out.println("Addition of the enter elements");
        int add=0;
        for(int i=0;i<=n-1;i++){
            add+=array[i];
        }
        System.out.println(add);
    }

    public static void main(String[] args) {
        Q66_Addition_using_constructors obj=new Q66_Addition_using_constructors();
        obj.input();
        obj.output();
    }
}