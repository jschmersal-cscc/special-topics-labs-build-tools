package edu.cscc.topics;

import com.google.common.hash.Hashing;

import java.nio.charset.Charset;

public class HashingTools {

    public static void main(String[] args) {
        for(String arg : args) {
            System.out.println(arg + " hashes to: " + hashIt(arg));
        }
    }
    public static String hashIt(String toBeHashed) {
        return Hashing.sha256().hashString(toBeHashed, Charset.defaultCharset()).toString();
    }
}
