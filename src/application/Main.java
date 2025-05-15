package application;

import entities.Persons;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print(" How Many Numbers Will You Type? ");
        int n = sc.nextInt();
        int room;


        Persons[] p = new Persons[n];


        for (int i = 0; i < n; i++) {
            System.out.print(" Name: ");
            String names = sc.next();
            System.out.print(" Email: ");
            String email = sc.next();
            while(true) {
                System.out.print(" Room: ");
                room = sc.nextInt();
                if (room < 10) {
                    break;
                } else {
                    System.out.println(" Select one Number under 10 ");
                }
            }
            p[i] = new Persons(names,email,room);
        }


            for ( int i = 0; i < n; i++) {
                if (p[i] != null) {
                    System.out.println(p[i]); // chama automaticamente o toString()
                }
              }
            }
         }
