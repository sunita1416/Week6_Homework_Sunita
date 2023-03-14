package javaprogrammes;
//2.1 Declare two static variables
//2.2 Declare one static method
//2.3 Call both static variables into the static method inside the print statement
//2.4 Declare the main method
//2.5 Call the static method into the main method and run the programme
public class StaticVariable {
    //x is a static variable //y is a static variable

    static int x = 200;
    static int y = 300;

    public static void main(String[] args) {
        StaticVariable obj = new StaticVariable();
        obj.method();
    }
    public static void method(){
        System.out.println(x);
        System.out.println(y);
    }





}
