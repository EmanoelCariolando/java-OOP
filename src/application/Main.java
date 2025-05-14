package application;

import entities.Products;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("How Many Numbers Will You Type?");
        int n = sc.nextInt();

        int[] v = new int[n];

        for (int i =0; i<n; i++){
             v[i] = sc.nextInt();
        }


        System.out.println("NEGATIVE NUMBERS");
        
        for (int i =0; i<n; i++){
            if(v[i] < 0){
              System.out.println(v[i]);
            }
        }






    }
}