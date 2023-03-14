package javaprogrammes;

public class OneInstanceOneStatic {
    // a is instance variable // b is a static variable
    int a = 50;
    static int b=100;

    public static void main(String[] args) {
        OneInstanceOneStatic obj = new OneInstanceOneStatic();
        obj.method();
        obj.method1();

    }
    public void method(){
        System.out.println(a);
        OneInstanceOneStatic obj = new OneInstanceOneStatic();
        System.out.println(obj.a);

    }
    public void method1(){
        System.out.println(b);
        OneInstanceOneStatic obj = new OneInstanceOneStatic();
        System.out.println(obj.b);


    }
}