// Remove duplicate elements from sorted Array

import java.util.*;

class Main {
    static int removeDuplicate(int[] a, int n) {
        Set<Integer> s = new LinkedHashSet<>();
        for (int num : a) {
            s.add(num);
        }

        int index = 0;
        for (int num : s) {
            a[index++] = num;
        }

        return s.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int newSize = removeDuplicate(a, n);
        for (int i = 0; i < newSize; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
