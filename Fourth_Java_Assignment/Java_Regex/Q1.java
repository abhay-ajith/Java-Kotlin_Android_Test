package Java_Regex;

import java.text.DecimalFormat;

public class Q1 {
    public static void main(String[] args) {
        long number = 1234567890;
        String formattedNumber = setThousandSeparator(number);
        System.out.println("Formatted number: " + formattedNumber);
    }

    public static String setThousandSeparator(long number) {
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        return decimalFormat.format(number);
    }
}
