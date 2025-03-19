/*
An integer number in base 10 which is divisible by the sum of its digits is said to be a Harshad Number.

Examples: 
Input: 3
Output: 3 is a Harshad Number

Input: 18
Output: 18 is a Harshad Number

Input: 15
Output: 15 is not a Harshad Number
*/

import java.util.*;

class harshad_number {
    static void isHarshadNumber(int n) {
        int temp = n, sum = 0;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println(n % sum == 0 ? "YES" : "NO");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isHarshadNumber(n);
    }
}
