/*
 * Given an array of integers, our task is to write a program that efficiently
 * finds the second-largest element present in the array.
 * 
 * Example:
 * 
 * Input: arr[] = {12, 35, 1, 10, 34, 1}
 * Output: The second largest element is 34.
 * Explanation: The largest element of the
 * array is 35 and the second
 * largest element is 34
 * 
 * Input: arr[] = {10, 5, 10}
 * Output: The second largest element is 5.
 * Explanation: The largest element of
 * the array is 10 and the second
 * largest element is 5
 * 
 * Input: arr[] = {10, 10, 10}
 * Output: The second largest does not exist.
 * Explanation: Largest element of the array
 * is 10 there is no second largest element
 */

import java.util.*;

class Main {
    static int getSecondLargest(int[] arr, int n) {
        Set<Integer> s = new TreeSet<>();
        for (int num : arr) {
            s.add(num);
        }

        if (s.size() == 1) {
            return -1;
        }

        List<Integer> v = new ArrayList<>(s);
        return v.get(v.size() - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(getSecondLargest(arr, n));
    }
}
