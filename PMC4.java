import java.util.Scanner;

/**
 * Check give number is Amstrong
 * 153
 * 1*1*1 + 5*5*5 + 3*3*3 = 153
 *
 * Declare the number num1,num,digit,sum=0,
 * Accept num1
 * num = num1;
 * for(;num>0;) {
 * digit = num1%10;
 * num1 = num1/10
 * sum = sum + digit*digit*digit;
 * }
 * if(sum == num1)
 *    print "Amstrong"
 * else "not Amstrong"
 *
 */
public class PMC4 {
    public static void main(String[] args) {
        int num1,num,digit,sum =0;

        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num = num1;


        for(;num1>0;){
            digit = num1%10;
            num1 = num1/10;
            sum = sum + digit * digit * digit;
        }
        if(sum == num)
            System.out.println("Amstrong");
        else
            System.out.println("not Amstrong");
    }
}
