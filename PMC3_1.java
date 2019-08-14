import java.util.Scanner;

/**
 * To check if String is palindrome or not
 * malayalam malayalam = palindrome
 * java  avaj  = not a palindrome
 *
 * Reverse the String
 * Delcare String str,rev;
 * Accept the String str;
 * for(int i = str.length()-1;i>=0;i--){
 * rev = rev + str.chartAt(i);
 * }
 * if(rev.equalIgnorecase(str)){
 *     print "palindrome"
 * }
 * else
 * print "not a palindrome"
 */

public class PMC3_1 {
    public static void main(String[] args) {
        String str,rev="";
        System.out.println("Enter  the String");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();

        for(int i = str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        if(rev.equalsIgnoreCase(str)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not a Palindrome");
        }

    }
}
