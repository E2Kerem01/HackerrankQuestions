package questions.BigInteger;

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class BigIntegerQuestion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BigInteger n = scanner.nextBigInteger();
        BigInteger m = scanner.nextBigInteger();

        findMathResult(n,m);
    }

    static void findMathResult(BigInteger n, BigInteger m){

            BigInteger sum = m.add(n);
            BigInteger mines = n.multiply(m);
            System.out.println(String.valueOf(sum));
            System.out.printf(String.valueOf(mines));

    }
}