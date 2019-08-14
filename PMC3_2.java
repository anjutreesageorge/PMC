import java.util.Scanner;

/**
 * To check if String is palindrome or not
 * malayalam malayalam = palindrome
 * java  avaj  = not a palindrome
 * Declare str;
 * Accept the str;
 * declare int backward;forward;
 * declare boolean isPalindrome = true;
 *backward = str.length()-1;
 * forward = 0;
 * for(;backaward>=forward;backward--,forward++){
 *     if(str.CharAt(backward)!=str.CharAt(forward)){
 *       isPalindrome = false;
 *       break;
 *     }
 *     if(isPalindrome) {print "Palindrome"}
 *     else {print "not palindrome"}
 * }
 */
public class PMC3_2 {
    public static void main(String[] args) {
        String str;
        int backward,forward;
        boolean isPalindrome =true;
        System.out.println("Enter  the String");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        backward =str.length()-1;
        forward = 0;
        for(;backward>=forward;backward--,forward++) {
            if (Character.toLowerCase(str.charAt(backward))!=Character.toLowerCase(str.charAt(forward))) {
                isPalindrome = false;
                break;
            }
        }
      if(isPalindrome){
      System.out.println("Palindrome");
      }
      else {
          System.out.println("not a Palindrome");}
  }

    }

