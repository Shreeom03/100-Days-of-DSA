// Problem statement
// Given an array 'arr' with 'n' elements, the task is to rotate the array to the left by 'k' steps, where 'k' is non-negative.



// Example:
// 'arr '= [1,2,3,4,5]
// 'k' = 1  rotated array = [2,3,4,5,1]
// 'k' = 2  rotated array = [3,4,5,1,2]
// 'k' = 3  rotated array = [4,5,1,2,3] and so on.
// Detailed explanation ( Input/output format, Notes, Images )
// Sample Input 1:
// 8
// 7 5 2 11 2 43 1 1
// 2
// Sample Output 1:
// 2 11 2 43 1 1 7 5
// Explanation of Sample Input 1:
// Rotate 1 steps to the left: 5 2 11 2 43 1 1 7
// Rotate 2 steps to the left: 2 11 2 43 1 1 7 5
// Sample Input 2:
// 4
// 5 6 7 8
// 3
// Sample Output 2:
// 8 5 6 7
// Explanation of Sample Input 2:
// Rotate 1 steps to the left: 6 7 8 5
// Rotate 2 steps to the left: 7 8 5 6
// Rotate 2 steps to the left: 8 5 6 7
// Expected Time Complexity:
// O(n), where ‘n’ is the size of the array ‘arr’ and ‘k’ is the number of rotations.
// Constraints:
// 1 <= 'n' <= 10^3
// 1 <= 'arr'[i] <= 10^9
// 1 <= 'k' < 'n'

import java.util.ArrayList;

public class Rotate_Array {
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        if(arr.size() < k){
            return arr;
        }

        int i,j,d,temp;
        int g_cd = gcd(arr.size(),k);

        for(i=0;i<g_cd;i++){
            temp = arr.get(i);
            j = i;
            while(true){
                d = j+k;
                if(d >= arr.size()){
                    d = d-arr.size();
                }
                if(d==i){
                    break;
                }
                arr.set(j,arr.get(d));
                j = d;
            }
            arr.set(j , temp);
        }
        return arr;
    }

    public static int gcd(int a , int b){
        if(b==0){
            return a; 
        }

        return gcd(b , a%b);
    }
}
