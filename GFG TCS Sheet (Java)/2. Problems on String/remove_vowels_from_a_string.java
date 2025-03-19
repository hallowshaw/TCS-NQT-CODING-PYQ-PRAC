// User function template for Java
/*
Given a string S, remove all vowels from the string.

Example:
Input: "geeksforgeeks"
Output: "gksfrgks"
*/

import java.util.*;

class remove_vowels_from_a_string {
    static String removeVowels(String S) {
        StringBuilder res = new StringBuilder();
        for (char ch : S.toCharArray()) {
            if ("aeiouAEIOU".indexOf(ch) == -1) {
                res.append(ch);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        System.out.println(removeVowels(S));
    }
}
