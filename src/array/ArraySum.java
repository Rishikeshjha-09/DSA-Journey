/*
Problem:
Given an integer array, find the sum of all its elements.

Time Complexity: O(n)
Space Complexity: O(1)
*/

package array;

public class ArraySum {
    public static int arraySum(int[] nums){
        int sum = 0;
        for(int x : nums){
            sum += x;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {-2,5,-1};
        int[] arr3 = {0,0,0,0};
        int[] arr4 = {7};
        int[] arr5 = {};
        System.out.println(arraySum(arr1));
        System.out.println(arraySum(arr2));
        System.out.println(arraySum(arr3));
        System.out.println(arraySum(arr4));
        System.out.println(arraySum(arr5));
    }
}
