import java.math.*;
import java.io.IOException;
import java.util.Scanner;

public class squareroot {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int rootnumber;
        rootnumber = sc.nextInt();

        int time;
        time = sc.nextInt();

        sc.close();

        BigInteger nearnumber;
        nearnumber = BigInteger.valueOf((int) Math.round(Math.sqrt(rootnumber)));

        square(nearnumber, BigInteger.valueOf(1), rootnumber, 1, time);
    }

    public static void square(BigInteger a, BigInteger b, int rootnum, int time, int end) {
        BigInteger ja = new BigInteger(String.valueOf(a));
        BigInteger mo = new BigInteger(String.valueOf(b));

        BigInteger newja = ja.multiply(ja);
        newja = newja.add(mo.multiply(mo.multiply(BigInteger.valueOf(rootnum))));

        BigInteger newmo = new BigInteger("2");
        newmo = newmo.multiply(a);
        newmo = newmo.multiply(b);

        System.out.print("time ");
        System.out.print(time);
        System.out.print(" : root ");
        System.out.print(rootnum);
        System.out.print(" = ");
        System.out.print(a);
        System.out.print(" / ");
        System.out.println(b);

        if(time == end) return;

        square(newja, newmo, rootnum, time + 1, end);
    }
}
