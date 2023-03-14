package javaprogrammes;

//1.1  Declare two instance variables.
//1.2 Declare one instance method.
//1.3 Call both instance variables into the instance method inside the print statement.
//1.4 declare the main method.
//1.5 Call the above instance method into the Main method and Run the programme

public class InstanceVariable {
 int c;

    public void addition(){
        int x = 100;
        int y = 200;
        c=x+y;
        System.out.println("Sum of the x and y is: " +c);

    }
    public void difference(){
        int m =300;
        int n =400;
        c=m-n;
        System.out.println("Difference between m and n is: "+c);


    }

    public static void main(String[] args) {
        InstanceVariable ins1 = new InstanceVariable();
        ins1.addition();
        ins1.difference();

    }


}





