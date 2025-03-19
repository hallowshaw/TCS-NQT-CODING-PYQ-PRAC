// Average of elements in the array

import java.util.*;

class Main {
    static int mean(int N, int[] A) {
        double sum = 0;
        for (int i = 0; i < N; i++) {
            sum += A[i];
        }
        return (int) Math.floor(sum / N);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(mean(N, A));
    }
}
