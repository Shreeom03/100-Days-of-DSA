// Problem statement
// You are given a number 'N' in the form of a string 'S', your task is to find the smallest number strictly greater than the given number 'N' which is a palindrome.

// Note:

// 1) A palindrome is a word, number, phrase, or another sequence of characters that reads the same backward as forward, such as 'naman', 'abcba', '1234321', etc
// 2) The numerical value of the given string 'S' will be greater than 0.
// 3) A single-digit number is also considered as a palindrome.
// 4) Note that the length of the string 'S' is nothing but the number of digits in the number 'N'.
// Detailed explanation ( Input/output format, Notes, Images )
// Constraints:
// 1 <= T <= 100
// 1 <= len(S) <= 10^4

// Time Limit : 1 sec
// Sample Input 1:
// 1
// 4
// 1221
// Sample Output 1:
// 1331
// Explanation for sample input 1:
// The next smaller palindrome to 1221 is 1331, as it is strictly greater than 1221 and it reads the same from the front and back both.
// Sample Input 2:
// 1
// 3
// 999
// Sample Output 2:
// 1001
// Explanation for sample input 1:
// The next smaller palindrome to 999 is 1001, as it is strictly greater than 999 and it reads the same from the front and back both.

public class Given_a_string_find_the_next_smallest_palindrome {
    public static String nextLargestPalindrome(String number, int length) {
		if(length == 0){
			return "";
		}
		// Write your code here.
		StringBuilder str = new StringBuilder();
		boolean allNine = true;
		int[] arr= new int[length];
		
		for(int i=0;i<length;i++){
			char ch = number.charAt(i);
			if(ch != '9'){
				allNine = false;
			}
			arr[i] = ch - 48;
		}

		if(allNine){
			return nextLargestPalindrome(length);
		}

		int mid = length/2;

		int i=mid-1;

		int j=length%2==0?mid:mid+1;

		while(i >= 0 && arr[i]==arr[j]){
			i--;
			j++;
		}

		boolean isLeftSmall = false;

		if(i < 0 || arr[i] < arr[j]){
			isLeftSmall = true;
		}

		while(i >= 0){
			arr[j++] = arr[i--];
		}

		if(isLeftSmall){
			int carry = 1;

			if(length%2==1){
				arr[mid]+=1;
				carry = arr[mid]/10;
				arr[mid]%=10;
			}

			i = mid-1;
			j = length%2==0?mid:mid+1;

			while(i >= 0 && carry > 0){
				arr[i] += carry;
				carry = arr[i]/10;
				arr[i]%=10;
				arr[j] = arr[i];
				i--;
				j++;
			}
		}

		for(i=0;i<arr.length;i++){
			str.append(Integer.toString(arr[i]));
		}

		return str.toString();
	}

	public static String nextLargestPalindrome(int length){
		StringBuilder str = new StringBuilder();
				str.append("1");

				for(int i=0;i<length-1;i++){
					str.append("0");
				}

				str.append("1");

				return str.toString();
	}
}
