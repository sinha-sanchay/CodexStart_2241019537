import java.util.*;
public class Q10_1754 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t =s.nextInt();

        for (int i=0; i<t;i++) {
            long a=s.nextLong();
            long b=s.nextLong();

            if (Empty(a, b)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    public static boolean Empty(long a, long b) {
        long max = Math.max(a, b);
        long min = Math.min(a, b);

        if (max > 2 * min) {
            return false;
        }
        long diff = max - min;
        return diff % 3 == 0;
    }

}