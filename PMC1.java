import java.util.Scanner;

/**
 * Write a Java program that accepts two integers
 * prints sum ,difference, product  and quotient
 *
 * Algorithm
 * Declare two integers num1,num2,sum,difference,product,quotient
 * Accept the integers num1 and num2
 * sum = num1 + num2;
 * print sum;
 * difference = num1 - num2;
 * print difference;
 * product = num1 * num2;
 * print product;
 * quotient = num1/num2
 * print quotient;
 */
public class PMC1 {
    public static void main(String[] args) {
        int num1,num2,sum,difference,product,quotient;
        System.out.println("Enter the two integers");

        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        //sum
        sum = num1 + num2;
        System.out.println("sum: "+sum);

        //difference
        difference = num1 - num2;
        System.out.println("difference: "+difference);

        //product
        product = num1 * num2;
        System.out.println("product:" +product);

        //quotient
        if(num2 == 0){
            System.out.println("Division by 0 is not possible");
        }
        else {
            quotient = num1 / num2;
            System.out.println("quotient:" + quotient);
        }


    }
}
