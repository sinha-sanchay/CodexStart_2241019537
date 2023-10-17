import java.util.*;

public class Q7_2205 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        String[] grayCode = GrayCode(n);
        for (String code : grayCode) {
            System.out.println(code);
        }
    }
    public static String[] GrayCode(int n) {
        if (n == 1) {
            String[] grayCode = new String[2];
            grayCode[0] = "0";
            grayCode[1] = "1";
            return grayCode;
        }
        String[] new_grayCode =GrayCode(n - 1);
        String[] grayCodeN= new String[2 * new_grayCode.length];

        for (int i = 0; i < new_grayCode.length; i++) {
            grayCodeN[i] = "0" + new_grayCode[i];
        }

        for (int i =new_grayCode.length - 1; i >= 0; i--) {
            grayCodeN[new_grayCode.length +(new_grayCode.length - 1 - i)] ="1" + new_grayCode[i];
        }
        return grayCodeN;
    }
}