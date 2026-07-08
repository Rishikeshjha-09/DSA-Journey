/*
Problem: Array Search (Linear Search)

Checks whether a target element exists in an array using a linear scan.

Time Complexity : O(n)
Space Complexity: O(1)
*/

package array;

public class  ArraySearch {
    public static boolean arraySearch(int[] arr,int target){
        for(int x : arr){
            if(x == target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(arraySearch(new int[]{1,4,5,3,6,9},9));
        System.out.println(arraySearch(new int[]{10}, 10));
        System.out.println(arraySearch(new int[]{2,4,6,8}, 5));
        System.out.println(arraySearch(new int[]{-5,-2,-10,-1}, -10));
        System.out.println(arraySearch(new int[]{1,2,3,2,5,2}, 2));
        System.out.println(arraySearch(new int[]{}, 5));
    }
}
