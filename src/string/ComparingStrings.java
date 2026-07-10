/*
Problem: Compare two strings character by character without using the built-in equals() method.
         Return true if both strings are identical; otherwise, return false.

Time Complexity: O(n)
Space Complexity: O(1)
*/

package string;

public class ComparingStrings {
    public static boolean compareStrings(String s1,String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
            for(int i = 0; i < s1.length(); i++){
                if(s1.charAt(i) != s2.charAt(i)){
                    return false;
                }
            }
            return true;
    }
    public static void main(String[] args) {
        System.out.println(compareStrings("ix","Algo"));
        System.out.println(compareStrings("", ""));
        System.out.println(compareStrings("Java", "Java"));
        System.out.println(compareStrings("abc", "abC"));
        System.out.println(compareStrings("abc", "abc "));
        System.out.println(compareStrings(" ", ""));
        System.out.println(compareStrings("0", "O"));
        System.out.println(compareStrings("A0O", "AO0"));
        System.out.println(compareStrings("avaj", "java"));
    }
}
