// Name: Sanchay Sinha
// Reg_no.: 2241019537
// PS LINK : https://cses.fi/problemset/task/1083

import java.util.*;
public class Q3_1083 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        long [] checked=new long[n+1];
        for(int i=1;i<n;i++){
            long num=s.nextLong();
            checked[(int)num]=num;

        }
        for(int i=1;i<=n;i++){
            if(checked[i]==0){
                System.out.println(i);
                break;
            }
        }
    }
}