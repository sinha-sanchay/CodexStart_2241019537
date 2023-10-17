import java.util.*;

public class Q8_2165 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int moves = (int) Math.pow(2, n) - 1;
        System.out.println(moves);

        TowerOfHanoi(n, 1, 3, 2);
    }
    static void TowerOfHanoi(int n, int src, int dest, int help) {
        if (n == 1) {
            System.out.println(src+ " " + dest);
            return;
        }
        TowerOfHanoi(n - 1, src, help, dest);
        System.out.println(src+ " " + dest);
        TowerOfHanoi(n - 1, help, dest, src);
    }
}