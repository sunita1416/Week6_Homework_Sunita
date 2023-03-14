package javaprogrammes;

public class TwoInstanceTwoStatic {
    int x = 30; // x is an Instance Variable
    int y = 40; //b is an Instance Variable

    //x is a Static variable //y is a static variable
    static int p = 50;
    static int q = 60;

    public static void main(String[] args) {
        TwoInstanceTwoStatic obj = new TwoInstanceTwoStatic();
        obj.Method();
        obj.Method1();

        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(p);
        System.out.println(q);
    }
    //Instance method
    public void Method() {
        System.out.println(x);
        System.out.println(y);

    }
    //Static method
    static void Method1() {
        System.out.println(p);
        System.out.println(q);
    }

}
