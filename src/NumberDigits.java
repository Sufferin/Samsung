import java.util.Locale;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class NumberDigits {
    public static String BinFraction (double a, int b) {
        String res = "";
        for (int i = 0; i < b; i++) {
            a *= 2;
            if (a > 1) {
                res += "1";
                a -= 1;
            } else {
                res += "0";
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double a = sc.nextDouble();
        int b = sc.nextInt();
        BinFraction(a,b);
        //int arr[][] = new int[a][a];
    }
}
//&&

