import java.util.Scanner;

/**
 * Write a program that accepts a string and
 * output the string twice in a row
 * first all uppercase then lowercase
 * Algorithm
 * Declare String str;
 * find the uppercase function print the uppercase
 * find lowercase function print the lowercase
 */

public class PMC2 {
    public static void main(String[] args) {
        String str;

        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        str = sc.next();

        System.out.print(str.toUpperCase()+" ");
        System.out.print(str.toLowerCase());

    }
}
