// Name: Sanchay Sinha
// Reg_no.: 2241019537
// PS LINK : https://cses.fi/problemset/task/1618

import java.util.*;
public class Q6_1618 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int count=0;
        if (n > 0) {
            do {
                n /= 5;
                count += n;
            } while (n > 0);
        }
        System.out.println(count);
    }
}