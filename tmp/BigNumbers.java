package tmp;

import java.math.BigInteger;

/**
 * Created by Home on 7/16/2017.
 */
public class BigNumbers {
    public static void main(String args[]){
        long a, b, c;
        BigInteger d, e, f;
        a = 9223372036854775807l;
        b = a;
        c = a * b;

        d = BigInteger.valueOf(a);
        e = BigInteger.valueOf(b);
        f = d.multiply(e);

        System.out.println("(long)       " + a + " * " + b + " = " + c);
        System.out.println("(BigInteger) " + d.toString() + " * " + e.toString() + " = " + f.toString());
    }
}
