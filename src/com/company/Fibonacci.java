package com.company;

public class Fibonacci {
    public static void main(String[] args){
        int num1 = 1, num2 = 0;

        System.out.println(num2);
        System.out.println(num1);

        for(int i = 0; i < 8; i++){
            num1 = num1 + num2;
            num2 = num1 - num2;
            if (ehPrimo(num1)) {
                System.out.println(num1 + "X");
            }
            System.out.println(num1);
        }
    }

    public static boolean ehPrimo(long number) {
        number = Math.abs(number);
        if (number % 2 == 0) {
            return false;
        }
        for (long i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}