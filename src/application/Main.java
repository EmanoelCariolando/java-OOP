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


        Persons[] p = new Persons[10];


        for (int i = 0; i < n; i++) {
            System.out.print(" Name: ");
            String names = sc.next();
            System.out.print(" Email: ");
            String email = sc.next();

            int room;
            while(true) {
                System.out.print(" Room: ");
                room = sc.nextInt();
                if (room < 10 && p[room] == null) {
                    break;
                } else {
                    System.out.println("room rented or unavailable ");
                }
            }
            p[room] = new Persons(names,email,room);
        }

            System.out.println("Busy Room");
            System.out.println(p);
            for ( int i = 0; i < p.length; i++) {
                if (p[i] != null) {
                    System.out.println(p[i]); // chama automaticamente o toString()
                }
              }
            }
         }
