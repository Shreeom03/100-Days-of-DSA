// Problem statement
// Given a string "pattern", which contains only two types of characters ‘(’, ‘)’.

// Your task is to find the minimum number of parentheses either ‘(’, ‘)’ we must add the parentheses in string ‘pattern’ and the resulted string is valid.

// Condition for valid string-

// Every opening parenthesis ‘(’ must have a correct closing parenthesis ‘)’.

// Example - ‘(()(()))’, ‘()()()’, ‘((()))’ are valid string, and ‘(((’, ‘(()’, ‘)(())’ are invalid string.

// Note:
// 1. You are not required to print the output explicitly, it has already been taken care of. Just implement the function and return the minimum number of parentheses required to make a string valid.
// Detailed explanation ( Input/output format, Notes, Images )
// Constraints:
// 1 <= T <= 50
// 1 <= N <= 10^4

// Where ‘T’ is the total number of test cases, ‘N’ denotes the length of string "pattern".

// Time limit: 1 second
// Sample Input 1:
// 2
// )((()
// ((
// Sample Output 1:
// 3
// 2
// Explanation of sample input 1:
// Test Case 1:

// In the given "pattern" = ")((()", only one pair of parentheses ( at index ‘3’ and ‘4’) is valid and parentheses at index ‘0’, ‘1’ and ‘2’ are invalid.
// As you can see, we need three extra parentheses to make the string valid in the above image, one opening parenthesis ‘(’ for index ‘0’, two closing parentheses ‘)’ for index ‘1’ and ‘2’.
// So return 3 number of minimum extra parentheses to make string "pattern" valid.

// Test Case 2:

// In the given "pattern" = "((" so we need two extra closing parentheses ‘)’ to make string "pattern" valid.
// So return 2 number of minimum extra parentheses to make string "pattern" valid.
// Sample Input 2:
// 2
// (((((
// ))(
// Sample Output 2:
// 5
// 3

import java.util.*;

public class Minimum_Parenthesis {
    public static int minimumParentheses(String pattern) {
		Stack<Character> s = new Stack<>();
		int count = 0;

		for(int i=0;i<pattern.length();i++){
			if(pattern.charAt(i)=='('){
				s.push('(');
			}
			else{
				if(s.isEmpty()){
					count++;
				}
				else{
					s.pop();
				}
			}
		}
		count+=s.size();

		return count;
	}
}
