package application;

import entities.Persons;

import java.util.List;
import java.util.ArrayList;

import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<n; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("showing diagonal numbers");
        for (int i=0; i<matriz.length; i++) {
            System.out.printf("%d%n",matriz[i][i]);
        }

        int count = 0;

         for (int i=0; i<matriz.length; i++) {
             for (int j=0; j<n; j++){
                 if (matriz[i][j] <0){
                     System.out.println("Show Negativa Numbers" + matriz[i][j]);
                     count++;
                 }
             }
        }

         System.out.println("Negative Numbers: " + count);


     }
    }
 /*
 1 -2 -3
-4 5 -6
-7 -8 9
 */


