/*
Given a number n, the task is to check whether the given number is positive, negative, odd, even, or zero.
Input : num = -98;
*/

import java.util.*;

class number_is_positive_negative_odd_even_zero {
    static void getOddEven(int num) {
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    static void checkNumber(int num) {
        if (num > 0) {
            System.out.print("Positive ");
        } else if (num < 0) {
            System.out.print("Negative ");
        } else {
            System.out.print("Zero ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkNumber(num);
        getOddEven(num);
    }
}
