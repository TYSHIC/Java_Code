package org.tyic;

import org.tyic.util.Util;

import java.util.Scanner;

public class Main {
    static void printIsPrime(int number) {
        if (Util.isPrime(number)) {
            System.out.printf("%d is prime%n",
                    number);
            return;
        }
        System.out.printf("%d is not prime%n",
                number);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        int power = scanner.nextInt();
        printIsPrime(base);
        printIsPrime(power);
        System.out.printf("%d ^ %d = %d", base,
                power, Util.pow(base, power));
    }
}

