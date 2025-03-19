/*
Given a string S, sort its characters in lexicographical order.

Example:
Input: "dcba"
Output: "abcd"
*/

import java.util.*;

class sort_string_of_characters {
    static String sort(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(sort(s));
    }
}
