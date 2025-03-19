/*
Given a string S, remove all spaces from the string.

Example:
Input: "g e e k s"
Output: "geeks"
*/

import java.util.*;

class remove_spaces_from_a_given_string {
    static String modify(String s) {
        return s.replaceAll(" ", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(modify(s));
    }
}
