// Name: Sanchay Sinha
// Reg_no.: 2241019537
// PS LINK : https://cses.fi/problemset/task/1617

import java.util.*;
public class Q5_1617 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        long n =s.nextLong();
        long num =1;
        for (int i =0; i < n; i++) {
            num=(num *2)%1000000007;
        }
        System.out.println(num);
    }
}