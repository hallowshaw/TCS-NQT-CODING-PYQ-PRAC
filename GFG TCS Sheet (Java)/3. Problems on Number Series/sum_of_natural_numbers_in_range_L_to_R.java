/*
Given a range L and R, the task is to find the sum of all natural numbers in range L to R. 

Examples:
Input: L = 2, R = 5
Output: 14

Input: L = 10, R = 20
Output: 165
*/

import java.util.*;

class sum_of_natural_numbers_in_range_L_to_R {
    static int getSum(int L, int R) {
        int sum = 0;
        for (int i = L; i <= R; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        System.out.println(getSum(L, R));
    }
}
