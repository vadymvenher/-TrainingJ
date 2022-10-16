import java.util.Scanner;

public class Homework1 {
    public static void main (String[] args) {
        System.out.println("Hello Wolrld!");

        Scanner myRadius = new Scanner (System.in);
        System.out.println("Radius is: ");
        double myR = myRadius.nextDouble();
        double s = Math.PI * myR * myR;
        double p = 2 * myR * Math.PI;
        System.out.println("Square is " + s);
        System.out.println("Perimeter is " + p);
        // myRadius.close();



        Scanner scan = new Scanner(System.in);
        String name, surname, adress;
        System.out.println("My name is: ");
        name = scan.nextLine();
        System.out.println("My surname is: ");
        surname = scan.nextLine();
        System.out.println("My adress is: ");
        adress = scan.nextLine();
        System.out.println("My name is: " + name + ", " + "My surname is: " + surname + ", " + "I live in " + adress);
        //scan.close();

        Scanner call = new Scanner (System.in);
        double c1, c2, c3, t1, t2, t3;
        c1 = call.nextDouble();
        c2 = call.nextDouble();
        c3 = call.nextDouble();
        t1 = call.nextDouble();
        t2 = call.nextDouble();
        t3 = call.nextDouble();
        double firstCall = c1 * t1;
        double secondCall = c2 * t2;
        double thirdCall = c3 * t3;
        double sumCall = firstCall + secondCall + thirdCall;
        System.out.println ("First call: " + firstCall + ", " + "Second call: " + secondCall + ", " + "Third call: " +
                thirdCall + ", " + "All calls: " + sumCall);
        call.close();








    }

}
