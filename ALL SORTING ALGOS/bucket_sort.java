import java.util.*;

class bucket_sort {
    static void bucketSort(float[] arr, int n) {
        List<Float>[] buckets = new List[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (float num : arr) {
            int index = (int) (num * n);
            buckets[index].add(num);
        }

        for (List<Float> bucket : buckets) {
            Collections.sort(bucket);
        }

        int index = 0;
        for (List<Float> bucket : buckets) {
            for (float num : bucket) {
                arr[index++] = num;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] arr = new float[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextFloat();
        }

        bucketSort(arr, n);
        System.out.println(Arrays.toString(arr));
    }
}
