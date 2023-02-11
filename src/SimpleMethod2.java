/**
 *
 * @author Trevor Hartman
 * @author Bryan Maus
 *
 * @since Version 1.0
 * @Date 02/10/2023
 */
import java.util.Scanner;

public class SimpleMethod2 {
    // Put your method code here, takes 1 integer, squares it, returns the integer result of the square.
    public static int square(int numb) {
        // Immediately returns the integer answer to the calling statement
        return ((numb) * (numb));
    }
    public static void main(String[] args) {
        // Put scanner code to get integer input here
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number you wish to square: ");
        int numb = in.nextInt();
        // Modify the below call to assign the result of the method call to a variable.
        int finalnumber = SimpleMethod2.square(numb);
        // Put the result System.out code here.
        System.out.println("\nThe number " + numb + " squared is: " + finalnumber);
    }
}
