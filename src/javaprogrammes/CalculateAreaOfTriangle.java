package javaprogrammes;

//input a b c
// 1. find semiperimeter
// 2. area of triangel
import java.util.Scanner;
//import java.lang.Math;


public class CalculateAreaOfTriangle {

    public static void main(String[] args) {

        int a,b,c,sp,area;
        System.out.print("Enter value for sides of Triangle ");
        Scanner r = new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        c=r.nextInt();

        sp=(a+b+c)/2;
        area= (int)Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
        System.out.print("Area of Triangle "+ area);









    }
}
