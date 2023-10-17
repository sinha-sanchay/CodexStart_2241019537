// Name: Sanchay Sinha
// Reg_no.: 2241019537
// PS LINK : https://cses.fi/problemset/task/1068

import java.util.*;
public class Q1_1068 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long n = s.nextInt();
        System.out.print(n);
        while(n>1){
            if(n%2 == 0){
                n/= 2;
            }
            else {
                n=n*3+1;
            }
            System.out.print(" "+n);
        }
    }
}