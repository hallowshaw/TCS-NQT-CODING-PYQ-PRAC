import java.util.*;

class Main {
    static String reverseWord(String str) {
        char[] arr = str.toCharArray();
        int l = 0, r = arr.length - 1;

        while (l < r) {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(reverseWord(str));
    }
}
