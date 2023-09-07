package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println("Even numbers in List");
        //Schritt 1: Filtert eine Liste von Zahlen und gebt nur die geraden Zahlen aus.
        List<Integer> integerList = new ArrayList<>(List.of(0,1,2,3,4,5,6,7,8,9,10));
        integerList.stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);


        System.out.println("-------------------------");
        System.out.println("double the Numbers in the list");
        //Schritt 2: Verwendet 'map' und verdoppelt jede Zahl in der Liste.
        integerList.stream()
                .map(number -> number * 2)
                .forEach(System.out::println);

        System.out.println("-------------------------");
        

    }
}