// Find duplicates in the array

import java.util.*;

class Main {
    static List<Integer> duplicates(int[] arr, int n) {
        List<Integer> v = new ArrayList<>();
        Set<Integer> s = new TreeSet<>();
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> x : mp.entrySet()) {
            if (x.getValue() > 1) {
                s.add(x.getKey());
            }
        }

        if (s.isEmpty()) {
            v.add(-1);
        } else {
            v.addAll(s);
        }

        return v;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> result = duplicates(arr, n);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
