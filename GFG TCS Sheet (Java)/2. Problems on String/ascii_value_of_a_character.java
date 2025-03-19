/*
Given a character, we need to print its ASCII value.

Examples:
Input : 'a' 
Output : 97

Input : 'D'
Output : 68
*/

import java.util.*;

class ascii_value_of_a_character {
    static int getASCIIValue(char c) {
        return (int) c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        System.out.println(getASCIIValue(c));
    }
}
