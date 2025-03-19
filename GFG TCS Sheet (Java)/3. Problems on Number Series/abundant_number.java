/*
A number n is said to be an Abundant Number if the sum of all its proper divisors is greater than n.

Examples:
Input: 21
Output: NO

Input: 12
Output: YES

Input: 17
Output: NO
*/

import java.util.*;

class abundant_number {
    static String isAbundant(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum > n ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isAbundant(n));
    }
}
