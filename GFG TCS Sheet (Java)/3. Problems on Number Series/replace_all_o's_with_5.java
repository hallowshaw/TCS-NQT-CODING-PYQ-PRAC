import java.util.*;

class replace_all_os_with_5 {
    static int convertFive(int n) {
        int res = 0;
        List<Integer> digits = new ArrayList<>();

        while (n > 0) {
            digits.add(n % 10);
            n /= 10;
        }

        Collections.reverse(digits);
        for (int digit : digits) {
            res = (res * 10) + (digit == 0 ? 5 : digit);
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(convertFive(n));
    }
}
