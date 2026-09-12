package Recursion;
import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    private static int  recursionCalls = 0;
    private static void conquer(int[] arr, int left,int middle,  int right){
        int[] temp = new int[right-left+1];
        int i = left, j = middle+1, k = 0;
        while(i <= middle && j <= right){
            if(arr[i] <= arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i <= middle){
            temp[k] = arr[i];
            i++; k++;
        }
        while(j <= right){
            temp[k] = arr[j];
            j++; k++;
        }
        for(int z = 0; z < temp.length; z++){
            arr[left + z] = temp[z];
        }
    }
    public static void divide(int[] arr, int low, int high){
        recursionCalls++;
        if(low < high){
            int mid = low + (high - low) / 2;
            divide(arr, low, mid);
            divide(arr, mid+1, high);
            conquer(arr, low, mid, high);
        }
    }
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int[] nums = new int[n];
       System.out.print("Enter Array's Elements : ");
       for(int i = 0; i < n; i++){
           nums[i] = s.nextInt();
       }
       divide(nums, 0, nums.length-1);
       System.out.println(Arrays.toString(nums));
       System.out.println("Number of Recursion Calls : "+ recursionCalls);
    }
}
