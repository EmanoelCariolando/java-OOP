package application;

import entities.Persons;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        String[] names = new String[]{"Maria","Macaco","Marcos"};

        for (String allName : names){
            System.out.println(allName);
        }


    }
}



