/*
Function to check whether two strings are anagram of each other or not.

Example:
Input: "listen", "silent"
Output: true

Input: "hello", "world"
Output: false
*/

import java.util.*;

class strings_are_anagram_of_each_other {
    static boolean isAnagram(String a, String b) {
        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        return Arrays.equals(arrA, arrB);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(isAnagram(a, b));
    }
}
