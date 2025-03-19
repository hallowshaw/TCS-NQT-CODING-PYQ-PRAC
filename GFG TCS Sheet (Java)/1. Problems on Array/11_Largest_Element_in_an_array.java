/*
Given an array arr[] of size N, the task is to find the largest element in the given array. 

Examples: 

Input: arr[] = {10, 20, 4}
Output: 20
Explanation: Among 10, 20 and 4, 20 is the largest. 

Input : arr[] = {20, 10, 20, 4, 100}
Output : 100

*/

import java.util.*;

class Main {
    static int getLargest(int[] arr, int n) {
        int lar = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            lar = Math.max(lar, arr[i]);
        }
        return lar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(getLargest(arr, n));
    }
}
