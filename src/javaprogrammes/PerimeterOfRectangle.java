package javaprogrammes;
import java.util.Scanner;
public class PerimeterOfRectangle {
    public static void main(String[] args) {
        //area of rectangle = width * height
        //perimeter of rectangle = 2*(height + width)

        Scanner sc = new Scanner(System.in);
        System.out.println("Input width");

        double width = sc.nextDouble();
        System.out.println("Input height ");
        double height = sc.nextDouble();
        System.out.println("Area is = " + (width * height) );
        System.out.println("Perimeter is = " + (2 * (height + width)));








    }
}
