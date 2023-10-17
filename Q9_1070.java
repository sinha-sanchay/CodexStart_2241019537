// Name: Sanchay Sinha
// Reg_no.: 2241019537
// PS LINK : https://cses.fi/problemset/task/1070/

import java.util.Scanner;
public class Q9_1070 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n>1&&n < 4) {
            System.out.println("NO SOLUTION");
        } else {
            StringBuilder evenStr = new StringBuilder();
            StringBuilder oddStr = new StringBuilder();

            for (int i = 2; i <= n; i += 2) {
                evenStr.append(i).append(" ");
            }
            System.out.print(evenStr);
            for (int i = 1; i <= n; i += 2) {
                oddStr.append(i).append(" ");
            }
            System.out.print(oddStr);
                }
        }
}
