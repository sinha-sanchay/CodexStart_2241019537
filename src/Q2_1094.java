import java.util.*;
public class Q2_1094 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n =s.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] =s.nextInt();
        }
        long moves = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                moves += arr[i - 1] - arr[i];
                arr[i] = arr[i - 1];
            }
        }
        System.out.println(moves);
    }
}