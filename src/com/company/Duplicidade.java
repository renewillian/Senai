package com.company;

import java.util.Arrays;

import java.util.HashSet;
import java.util.List;

import java.util.Set;

public class Duplicidade {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(new Integer[]{1,2,1,3,4,4});
        Set<Integer> numeros = new HashSet<>(numbers);
        System.out.println(numeros);

    }
}
