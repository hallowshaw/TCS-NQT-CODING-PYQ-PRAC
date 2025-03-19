// Armstrong Numbers
// User function Template for Java

import java.util.*;

class armstrong_numbers {
    static String armstrongNumber(int n) {
        int temp = n, res = 0;
        List<Integer> digits = new ArrayList<>();

        while (temp > 0) {
            digits.add(temp % 10);
            temp /= 10;
        }

        for (int digit : digits) {
            res += (digit * digit * digit);
        }

        return (n == res) ? "Yes" : "No";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(armstrongNumber(n));
    }
}
