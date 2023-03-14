package javaprogrammes;

import java.util.Scanner;
public class TempFahrenheitToCelsius {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Fahrenheit to Celsius");
        int result = scan.nextInt();
        System.out.println("Enter Fahrenheit value: ");
        double value = scan.nextDouble();
        double valueFinal = (value - 32) * 5/9;
        System.out.print("Celsius is: ");
        System.out.println(Math.round(valueFinal*10.0)/10.0);



    }


}
