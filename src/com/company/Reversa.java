package com.company;

import java.util.Scanner;

public class Reversa {

    public static void main(String[] args) {
        System.out.println("digite uma string :");
        Scanner scanner = new Scanner(System.in);
        String leitura = scanner.next();
        StringBuffer stringReversa = new StringBuffer(leitura);
        if (stringReversa.length() % 2 == 0) {
            System.out.println("essa string é par");
        } else {
            System.out.println(stringReversa.reverse());
        }
    }
}
