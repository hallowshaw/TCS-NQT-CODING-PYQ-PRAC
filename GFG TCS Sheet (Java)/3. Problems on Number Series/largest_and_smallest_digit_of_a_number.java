/*
Given a number N. The task is to find the largest and the smallest digit of the number.

Examples:
Input : N = 2346 
Output : 6 2 

Input : N = 5 
Output : 5 5
*/

import java.util.*;

class largest_and_smallest_digit_of_a_number {
    static void getLargestAndSmallest(int n) {
        List<Integer> digits = new ArrayList<>();
        while (n > 0) {
            digits.add(n % 10);
            n /= 10;
        }

        Collections.sort(digits);
        System.out.println(digits.get(digits.size() - 1) + " " + digits.get(0));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        getLargestAndSmallest(n);
    }
}
