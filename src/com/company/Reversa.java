package com.company;

public class Reversa {

    public static void main(String[] args) {
        StringBuffer stringReversa = new StringBuffer("1234");
        if (stringReversa.length() % 2 == 0) {
            System.out.println("essa string é par");
        } else {
            System.out.println(stringReversa.reverse());
        }
    }
}
