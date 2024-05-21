package questions.primalitytest;
import java.math.BigInteger;
import java.io.*;
import java.util.Scanner;

import static java.util.stream.Collectors.joining;


public class PrimeCheck {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        BigInteger n = scanner.nextBigInteger();

        result(n);

    }

    static void result(BigInteger i) {

        if (i.isProbablePrime(10)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

    }


}

