package javaprogrammes;

import java.util.Scanner;
public class RadiusValueOfCircle {
    public static void main(String[] args) {
        double radius,area;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle");
        radius = input.nextDouble();
        input.close();

        area = Math.PI * radius * radius;
        System.out.println("Area of the Circle is "+area);


    }


}
