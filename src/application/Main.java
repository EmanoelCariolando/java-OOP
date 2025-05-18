package application;

import entities.Persons;

import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the numbers of rows and columns of the matrix: ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] mat = new int[n][m];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < m; j++) {
               mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the number to be searched: ");
        int chosedNumber = sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j<mat[i].length; j++) {
                if (mat[i][j] == chosedNumber){
                    System.out.println("Position: (" + i + "," + j + " ) ");
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    if (j < mat[i].length - 1){
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if (i < mat.length - 1){
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                }
            }

        }

    sc.close();
    }

}



