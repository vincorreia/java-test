package com.vincorreia;

public class FizzBuzz {
    final static String DIVISIBLE_BY_3 = "Buzz";
    final static String DIVISIBLE_BY_5 = "Fizz";
    public static String evaluate (int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return STR."\{DIVISIBLE_BY_5}\{DIVISIBLE_BY_3}";
        }

        if (number % 3 == 0) {
            return FizzBuzz.DIVISIBLE_BY_3;
        }

        if (number % 5 == 0) {
            return FizzBuzz.DIVISIBLE_BY_5;
        }

        return STR."\{number}";
    }
}
