package com.example.numeros;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class NumeroService {

    public Integer obtenerTotal(Integer n) {
        /** El numero 13 de la mala suerte
         * Crear un algoritmo que pasado un numero n debe retonar
         * la cantidad de numeros que hay sin contar los que contengan
         * el 13,
         *
         * Ejemplo 1
         * numero = 100
         * numeros a descartar =  13
         * total numeros: 99
         *
         * Ejemplo 2:
         * numero = 1000
         * numeros a descartar =  13, 130...139
         * total numeros: 989
         *
         * Ejemplo 2:
         * numero = 3800
         * numeros a descartar = 13, 130..139 , 1300...1399.
         * total numeros: 3699
         */

        //Exercise as I understand
        IntStream.range(1, n)
                .filter(num -> !Integer.toString(num).contains("13"))
                .forEach(num -> System.out.println(num));


        long count = IntStream.range(1,n)
                .filter(num -> !Integer.toString(num).contains("13"))
                .count();
        System.out.println("Count: " + count);

        //Exercise as Mateo says
        long count2 = IntStream.range(0,n)
                .filter(num -> !Integer.toString(num).startsWith("13"))
                .count();
        System.out.println("Count: " + count2);

        int numeros = (int) count2;
        return numeros;

    }
}
