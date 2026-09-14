/*
 * Problem: Quick Sort
 *
 * Given an array of integers, sort the array in ascending order
 * using the Quick Sort algorithm.
 *
 * Approach:
 * 1. Choose the last element as the pivot.  "Lomuto Partition"
 * 2. Partition the array so that elements <= pivot are placed
 *    before it and elements > pivot are placed after it.
 * 3. Place the pivot at its correct sorted position.
 * 4. Recursively apply Quick Sort to the left and right partitions.
 *
 * Technique: Divide and Conquer
 *
 * Time Complexity:                            * Space Complexity:
 * Best Case    : O(n log n)                   * Average Case : O(log n)  -> Recursion stack
 * Average Case : O(n log n)                   * Worst Case   : O(n)      -> Recursion stack
 * Worst Case   : O(n²)                        * Auxiliary Array Space: O(1)
 */


package Recursion;
import java.util.Scanner;
import java.util.Arrays;
public class QuickSort {
    public static int partition(int[] arr, int start, int end){
        int pivotElement = arr[end];
        int idx = start;
        for(int i = start; i < end; i++){
            if(arr[i] <= pivotElement){
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                idx++;
            }
        }
        int temp = arr[idx];
        arr[idx] = arr[end];
        arr[end] = temp;
        return idx;
    }
    public static void quickSort(int[] arr, int left, int right){
        if(left < right){
            int partitionIndex = partition(arr, left, right);
            quickSort(arr, left, partitionIndex-1);
            quickSort(arr, partitionIndex+1, right);
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        int[] nums = new int[length];
        for(int i = 0; i < length; i++){
            nums[i] = s.nextInt();
        }
        quickSort(nums, 0, length-1);
        System.out.println(Arrays.toString(nums));
    }
}
