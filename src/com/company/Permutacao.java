package com.company;

public class Permutacao {

    public static void permuta(String str) {
        permuta("", str);
    }

    private static void permuta(String prefix, String str) {
        int n = str.length();
        if (n == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                permuta(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }
}
