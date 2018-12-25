package com.fpinjava.recursion.exercise04_01;

import java.math.BigInteger;

public class Fibonacci {

    public static BigInteger fib(int x) {
//    throw new RuntimeException("To be implemented.");
        return fib_(BigInteger.ZERO, BigInteger.ONE,  BigInteger.valueOf(x));
    }

    private static BigInteger fib_(BigInteger acc1, BigInteger acc2, BigInteger x) {
        if (x.equals(BigInteger.ZERO)) {
            return BigInteger.ZERO;
        } else if (x.equals(BigInteger.ONE)) {
            return acc1.add(x);
        } else {
            return fib_(acc2, acc1.add(acc2), x.subtract(BigInteger.ONE));
        }

    }
}
