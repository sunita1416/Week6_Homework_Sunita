package javaprogrammes;

import java.util.Scanner;

public class AddTwoBinaryNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Binary number : ");
        String x= sc.next();
        System.out.print("Enter 2st Binary number : ");
        String y= sc.next();

        int n1=Integer.parseInt(x, 2);
        int n2=Integer.parseInt(y, 2);
        int n3=n1+n2;

        System.out.println("n1 : "+Integer.toBinaryString(n1));
        System.out.println("n2 : "+Integer.toBinaryString(n2));
        System.out.println("n3=n1+n2 : "+Integer.toBinaryString(n3));




    }
}
