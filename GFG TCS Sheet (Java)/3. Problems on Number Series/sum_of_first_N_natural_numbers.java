/*
Given a number n, find the sum of the first natural numbers.

Examples: 
Input: n = 3
Output: 6

Input: n = 5
Output: 15
*/

import java.util.*;

class sum_of_first_N_natural_numbers {
    static int getSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getSum(n));
    }
}
