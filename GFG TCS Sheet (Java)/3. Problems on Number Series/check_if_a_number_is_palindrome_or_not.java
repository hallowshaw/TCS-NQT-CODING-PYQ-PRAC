// User function Template for Java

import java.util.*;

class check_if_a_number_is_palindrome_or_not {
    static int isDigitSumPalindrome(int N) {
        List<Integer> digits = new ArrayList<>();
        int temp = N, sum = 0;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        while (sum > 0) {
            digits.add(sum % 10);
            sum /= 10;
        }

        int l = 0, r = digits.size() - 1;

        if (digits.size() == 1) {
            return 1;
        }

        while (l < r) {
            if (!Objects.equals(digits.get(l), digits.get(r))) {
                return 0;
            }
            l++;
            r--;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(isDigitSumPalindrome(N));
    }
}
