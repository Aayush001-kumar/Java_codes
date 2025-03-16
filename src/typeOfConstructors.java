public class typeOfConstructors {
    float a;
    int b;
    typeOfConstructors(){
        System.out.println("Default constructor");
        a=0;
        b=0;
    }
    typeOfConstructors(int x,int y){
        System.out.println("2 parameter constructor");
        a=x;
        b=y;
    }
    typeOfConstructors(float x){
        System.out.println("1 parameter constructor");
        a=(float)x;
    }

    void output(){
        System.out.println("a="+a);
        System.out.println("b="+b);
    }

    public static void main(String[] args) {
        typeOfConstructors obj_1=new typeOfConstructors();
        obj_1.output();
        typeOfConstructors obj_2=new typeOfConstructors(55,77);
        obj_2.output();
        typeOfConstructors obj_3=new typeOfConstructors(77.5f);
        obj_3.output();
    }
}
