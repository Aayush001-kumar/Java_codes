public class constructors_Demo {
    int a,b;
    constructors_Demo(){
        System.out.println("This is a constructor method");
        a=40;
        b=50;
    }
    void output(){
        System.out.println("This is a normal method");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }

    public static void main(String[] args) {
        constructors_Demo object = new constructors_Demo();
        object.output();
    }
}
