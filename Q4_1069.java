// Name: Sanchay Sinha
// Reg_no.: 2241019537
// PS LINK : https://cses.fi/problemset/task/1069

import java.util.*;
public class Q4_1069 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int rep= 1;
        int max = 1;
        for (int i=1; i <str.length();i++) {
            if (str.charAt(i)==str.charAt(i-1)) {
                rep++;
                max=Math.max(max,rep);
            }
            else {
                rep= 1;
            }
        }
        System.out.println(max);
    }
}
