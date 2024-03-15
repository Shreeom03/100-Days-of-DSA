// Problem statement
// Reverse the given string word-wise. The last word in the given string should come at 1st place, the last-second word at 2nd place, and so on. Individual words should remain as it is.

// Detailed explanation ( Input/output format, Notes, Images )
// Constraints :
// 0 <= |S| <= 10^5
// where |S| represents the length of string, S.
// Sample Input 1:
// Welcome to Coding Ninjas
// Sample Output 1:
// Ninjas Coding to Welcome
// Sample Input 2:
// Always indent your code
// Sample Output 2:
// code your indent Always
import java.util.*;


public class Reverse_String_Word_Wise {
        static String reverseStringWordWise(String input) {
        
        StringBuilder str = new StringBuilder();
        int start = input.length();

        for(int i=input.length()-1;i>=0;i--){
            if(input.charAt(i)==' '){
                str.append(input.substring(i+1,start));
                str.append(" ");
                start = i;
            }
        }

        str.append(input.substring(0,start));

        return str.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);
    }
}
