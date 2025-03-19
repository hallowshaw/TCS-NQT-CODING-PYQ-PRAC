/*
Write a program to reverse the digits of an integer.

Examples:  
Input : num = 12345
Output: 54321

Input : num = 876
Output: 678
*/

import java.util.*;

class reverse_digits_of_a_number {
    static int getReverse(int num) {
        int res = 0;
        while (num > 0) {
            res = (res * 10) + num % 10;
            num /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(getReverse(num));
    }
}
