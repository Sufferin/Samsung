import java.util.Locale;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.*;
import java.util.Optional;
import java.util.Comparator;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        //Triangle myTriangle = new Triangle(new Point(0, 0), new Point(0, 5), new Point(4, 0));
        Rectangle myRec = new Rectangle(new Point(0, 0), new Point(10, 10));
        //System.out.println(myRec.getS(new Point(0, 0), new Point(10, 10)));
        System.out.println(myRec);
    }
}
//String strs[] = str.split("\\+");
//100000000001