/**
 *
 * @author Trevor Hartman
 * @author Bryan Maus
 *
 * @since Version 1.0
 * @Date 01/10/2023
 */
import java.util.Scanner;

public class Radians {


    public static double toRadians(double degrees) {
        // Put your code here
        double pi = 3.1415926535897932384626433;
        double radians = degrees * pi / 180;
        return radians;
    }

    public static double toDegrees(double radians) {
        // Put your code here
        double pi=3.1415926535897932384626433;
        double degrees = radians * 180 / pi;
        return degrees;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type degrees you'd like converted to radians: ");
        double degrees = Double.valueOf(scanner.nextLine());

        // Add System.out, your method call, and Math.toRadians call here
        toRadians(degrees);
        System.out.println("Number of radians the hard way: " + toRadians(degrees));
        System.out.println("Number of radians the easy way: " + Math.toRadians(degrees));

        System.out.print("Type radians you'd like converted to degrees: ");
        double radians = Double.valueOf(scanner.nextLine());

        // Add System.out, your method call, and Math.toDegrees call here
        toDegrees(radians);
        System.out.println("Number of degrees the hard way: " + toDegrees((radians)));
        System.out.println("Number of degrees the easy way: " + Math.toDegrees(radians));
    }
}
