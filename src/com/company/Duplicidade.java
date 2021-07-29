package com.company;

import java.util.Scanner;

public class Duplicidade {

    public static void main(String[] args) {

        System.out.println("digite o tamanho do seu array :");
        Scanner scanner = new Scanner(System.in);
        Integer i = scanner.nextInt();
        int[] array =  new int[i];
        for (int j = 0; j < array.length; j++) {
            System.out.println("valor : " + array[i]);
        }

         }
}
