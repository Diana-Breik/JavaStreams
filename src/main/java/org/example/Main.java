package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        System.out.println("Even numbers in List: ");
        //Schritt 1: Filtert eine Liste von Zahlen und gebt nur die geraden Zahlen aus.
        List<Integer> integerList = new ArrayList<>(List.of(0,1,100,7,1,9,10));
        integerList.stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);


        System.out.println("-------------------------");
        System.out.println("double the Numbers in the list: ");
        //Schritt 2: Verwendet 'map' und verdoppelt jede Zahl in der Liste.
        integerList.stream()
                .map(number -> number * 2)
                .forEach(System.out::println);

        System.out.println("-------------------------");
        System.out.println("the ordered list: ");
        //Schritt 3: Sortiert die Liste in aufsteigender Reihenfolge
        integerList.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("-------------------------");
        //Schritt 5: Nutzt 'forEach' und gebt jede verarbeitete Zahl aus.
        System.out.println("the ordered list of even and double numbers: ");
        integerList.stream()
                .filter(number -> number % 2 == 0) //0,100,10
                .map(number -> number * 2)//0,200,20
                .sorted()//0,20,200
                .forEach(System.out::println);

        System.out.println("-------------------------");
        //Schritt 4:Führt eine reduce'-Operation durch,um die Summe aller Zahlen in der Liste zu berechnen.
        int sum = integerList.stream()
                .reduce(0, (a,b) -> a+b);
        System.out.println("the sum of all numbers in the list is: " + sum);

        System.out.println("-------------------------");

        //Schritt 6:Sammelt die verarbeiteten Zahlen in einer neuen Liste mit collect'.
        List<Integer> newlist =integerList.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * 2)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("the ordered list of even and double numbers: ");//als List
        System.out.println(newlist);
        System.out.println("-------------------------");


    }
}