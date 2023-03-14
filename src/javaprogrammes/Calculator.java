package javaprogrammes;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number: ");
        int a = scanner.nextInt();
        System.out.println("Second number: ");
        int b = scanner.nextInt();
        System.out.println("Third number: ");
        int c = scanner.nextInt();
        System.out.println("Forth number: ");
        int d = scanner.nextInt();

        Calculator obj = new Calculator();
        obj.pen();
        obj.pen1();
        pencil();
        pencil1();
        int answer= (a+b+c+d); //addition
        int answer1= (a-b-c-d); //Subtraction
        int answer2= (a*b*c*d); //multiplication
        int answer3= (a/b/c/d); //division


    }
    public static void pen() {int a;} //static method
    public static void pen1() {int b;}
    public static void pencil() {int c;} //instance method
    public static  void pencil1() {int d;}



}
