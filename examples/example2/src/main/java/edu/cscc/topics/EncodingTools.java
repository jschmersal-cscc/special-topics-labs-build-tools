package edu.cscc.topics;

import org.apache.commons.codec.binary.Base64;

public class EncodingTools {
    public static void main(String[] args) {
        for(String arg : args) {
            if (isBase64(arg)) {
                System.out.println(arg + " IS base64");
            } else {
                System.out.println(arg + " IS NOT base64");

            }
        }
    }

    public static Boolean isBase64(String stringToCheck) {
        return Base64.isBase64(stringToCheck);
    }
}
