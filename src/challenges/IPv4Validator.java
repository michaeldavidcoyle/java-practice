package challenges;

import java.util.Arrays;

public class IPv4Validator {
    /*
    * An IPv4 formatted address contains 4 integers ranging from 0 to 255 separated by periods (.). Write a function
    * that takes a string as input and returns true if the string is a valid IPv4 address. Return false otherwise.
    * Example:
    *   Input: 123.123.123.123 | Output: true
    *   Input: 0.0.0.256 | Output: false
    */

    public static void main(String[] args) {
        String[] addresses = {
                "123.123.123.123",
                "211.205.113.004",
                "111.127.097.244",
                "211.227.190.141",
                "0.0.0.256",
                "101.154-209.7",
                "109.215.260.9",
                "333.312.198.107",
                "123-021-123-001"
        };

        for (String address : addresses) {
            if (isValidIPv4(address)) {
                System.out.println(address + " is a valid IPv4 address");
            } else {
                System.out.println(address + " is invalid");
            }
        }
    }

    private static boolean isValidIPv4(String address) {
        String[] numericStrings = address.split("\\.");
        if (numericStrings.length != 4) return false;

        try {
            for (String numericString : numericStrings) {
                int integer = Integer.parseInt(numericString);
                if (integer < 0 || integer > 255) return false;
            }

            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}

