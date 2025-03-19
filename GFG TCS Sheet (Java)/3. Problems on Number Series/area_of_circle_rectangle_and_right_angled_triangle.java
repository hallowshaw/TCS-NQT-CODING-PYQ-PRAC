import java.util.*;

class area_of_circle_rectangle_and_right_angled_triangle {
    static List<Integer> getAreas(int L, int W, int B, int H, int R) {
        List<Integer> areas = new ArrayList<>();
        areas.add(L * W); // Rectangle
        areas.add((int) (0.5 * B * H)); // Right Angled Triangle
        areas.add((int) (3.14 * R * R)); // Circle
        return areas;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int W = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();
        int R = sc.nextInt();

        List<Integer> result = getAreas(L, W, B, H, R);
        for (int area : result) {
            System.out.print(area + " ");
        }
        System.out.println();
    }
}
