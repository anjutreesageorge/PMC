import java.util.Scanner;

/**
 * To check if String is palindrome or not
 * malayalam malayalam
 * java  avaj
 * 1.reverse the string check both -
 * char by char
 * StringBuffer
 * 2.checking forward and backward
 *
 *Algorithm
 * Declare the String str,reverse;
 * Accept the String str;
 *reverse using for loop
 * if(reverse == str)
 * then print palindrome
 * else not palindrome
 *
 */

public class PMC3 {
    public static void main(String[] args) {
      /* String str,reverse ="";

       System.out.println("Enter the String");
       Scanner sc = new Scanner(System.in);
       str = sc.next().toLowerCase();
        //System.out.println(str.length());
       for(int i = (str.length()-1);i>=0;i--){
           reverse = reverse+ str.charAt(i);
       }

       System.out.println("reverse: "+reverse);
       if(str.trim() .equals( reverse.trim())){
           System.out.println("palindrome");
       }
       else{
           System.out.println("not palindrome");
       }
*/
      //second method
        String str;
        int forward, backward;
        Boolean isPlalindrome = true;
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        str = sc.next().toLowerCase();
        for(forward =0,backward =(str.length()-1);backward>forward;backward--,forward++){
            if(str.charAt(forward)!=str.charAt(backward)) {
                isPlalindrome = false;
                break;
            }
        }
    if(isPlalindrome==true){
        System.out.println("palindrome");
    }
    else{
        System.out.println("not a palindrome");
    }
    }


}
