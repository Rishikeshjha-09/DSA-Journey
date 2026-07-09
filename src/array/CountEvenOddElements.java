/*
Problem: Count Even and Odd Elements.

Return an integer array in the format:
[evenCount, oddCount]

Time Complexity: O(n)
Space Complexity: O(1)   // Ignoring the returned array

*/

package array;

import java.util.Arrays;
public class CountEvenOddElements {
    public static int[] counts(int[] nums) {
        int evenCount = 0;
        int oddCount = 0;
        for(int x : nums){
            if(x % 2 == 0){
                evenCount++;
            }
            else {
                oddCount++;
            }
        }
        return new int[]{evenCount,oddCount};
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(counts(new int[]{2, 4, 7, 19, 5, 7})));
        System.out.println(Arrays.toString(counts(new int[]{2, 2, 2, 2, 2})));
        System.out.println(Arrays.toString(counts(new int[]{9, 9, 9, 9, 9})));
        System.out.println(Arrays.toString(counts(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})));
        System.out.println(Arrays.toString(counts(new int[]{9, -2, 0, 0, -10})));
        System.out.println(Arrays.toString(counts(new int[]{-100, -99, -98, -97, -96})));
        System.out.println(Arrays.toString(counts(new int[]{0, 0})));
        System.out.println(Arrays.toString(counts(new int[]{8})));
        System.out.println(Arrays.toString(counts(new int[]{7})));
        System.out.println(Arrays.toString(counts(new int[]{})));
    }
}
