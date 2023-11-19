package com.vincorreia;

public class Utils {
    final static byte MONTHS_IN_YEAR = 12;
    public static float toPercent (float percentage) {
        final byte PERCENTAGE_CONVERSION_RATE = 100;

        return percentage / PERCENTAGE_CONVERSION_RATE;
    }
    public static float rateToMonthly (float yearlyRate) {
        return yearlyRate / Utils.MONTHS_IN_YEAR;
    }

    public static float yearsToMonth(float years) {
        return years * Utils.MONTHS_IN_YEAR;
    }
}
