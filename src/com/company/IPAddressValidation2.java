package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class IPAddressValidation2 {
    public static boolean isValidIPAdresss(String ip) {
        String zeroTo255 = "(\\d{1,2}|(0|1)\\"
                + "d{2}|2[0-4]\\d|25[0-5])";
        String regex
                = zeroTo255 + "\\."
                + zeroTo255 + "\\."
                + zeroTo255 + "\\."
                + zeroTo255;
        Pattern p = Pattern.compile(regex);
        if (ip == null) {
            return false;
        }
        Matcher m = p.matcher(ip);

        // Return if the IP address
        // matched the ReGex
        return m.matches();
    }

    public static void main(String[] args) {
        System.out.println("Enter an IP Address");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isValidIPAdresss(str));

    }


}
