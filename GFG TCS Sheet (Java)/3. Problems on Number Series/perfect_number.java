// User function Template for Java

import java.util.*;

class perfect_number {
    static int factorial(int n) {
        int fact = 1;
        while (n > 0) {
            fact *= n;
            n--;
        }
        return fact;
    }

    static boolean isPerfect(int N) {
        int res = 0;
        List<Integer> digits = new ArrayList<>();
        int temp = N;

        while (temp > 0) {
            digits.add(temp % 10);
            temp /= 10;
        }

        for (int digit : digits) {
            res += factorial(digit);
        }

        return res == N;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(isPerfect(N));
    }
}
