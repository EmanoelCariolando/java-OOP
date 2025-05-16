package application;

import entities.Persons;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        List<String> list = new ArrayList<>(); //create a new list

        list.add("Manel"); //add one element to the list
        list.add("kanye");
        list.add("nihil");
        list.add("sheva");
        list.add("kael");

        System.out.println(list.size()); //shows how many items are in the list

        list.remove(2);// remove one item
        list.add(2,"sofia");
        //add an item

        for(String names : list) {
            System.out.println(names);
        }

        System.out.println("-------------------------------");

        list.removeIf(x -> x.charAt(0) == 's'); //remove only the letter passed after the char
        for(String x : list) {
            System.out.println(x);
        }

        System.out.println("Index of kanye: " + list.indexOf("kanye"));

        System.out.println("-------------------------------");

        List<String> newList = list.stream().filter(x -> x.charAt(0) == 'k').collect(Collectors.toList());
        for(String x : newList) {
            System.out.println(x);
        }



    }
}



