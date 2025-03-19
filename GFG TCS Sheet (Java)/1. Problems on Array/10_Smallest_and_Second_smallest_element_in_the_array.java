/*
 * Given an array of integers, your task is to find the smallest and second
 * smallest element in the array. If smallest and second smallest do not exist,
 * print -1.
 * 
 * Example 1:
 * 
 * Input :
 * 5
 * 2 4 3 5 6
 * Output :
 * 2 3
 * Explanation:
 * 2 and 3 are respectively the smallest
 * and second smallest elements in the array.
 * 
 * Example 2:
 * 
 * Input :
 * 6
 * 1 2 1 3 6 7
 * Output :
 * 1 2
 * Explanation:
 * 1 and 2 are respectively the smallest
 * and second smallest elements in the array.
 */

import java.util.*;

class Main {
    static List<Integer> minAnd2ndMin(int[] a, int n) {
        int s1 = Integer.MAX_VALUE, s2 = Integer.MAX_VALUE;
        Set<Integer> s = new HashSet<>();

        for (int num : a) {
            s.add(num);
        }

        if (s.size() <= 1) {
            return Arrays.asList(-1);
        }

        for (int i = 0; i < n; i++) {
            s1 = Math.min(s1, a[i]);
        }

        for (int i = 0; i < n; i++) {
            if (a[i] != s1) {
                s2 = Math.min(s2, a[i]);
            }
        }

        return Arrays.asList(s1, s2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        List<Integer> result = minAnd2ndMin(a, n);
        System.out.println(result);
    }
}
