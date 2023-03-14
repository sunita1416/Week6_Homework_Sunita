package javaprogrammes;

public class DecimalToBinary {
    public static void main(String[] args) {
        int no = 5;
        String binaryString = Integer.toBinaryString(no);
        System.out.println(binaryString);
        int temp = no;
        String str = "";
        while(temp != 0) {
            int rem = temp % 2;
            str = rem + str;
            temp = temp / 2;
        }


        }



    }





