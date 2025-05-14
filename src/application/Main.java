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

        Double[] v = new Double[n];

        for (int i =0; i<n; i++){
            System.out.println("Type one Number:");
             v[i] = sc.nextDouble();
        }

        System.out.print("Values =");

        double sum = 0.0;
        for (int i =0; i<n; i++){
          System.out.print( " "  +v[i]+ " " );
          sum += v[i];
        }
        System.out.println();
        System.out.printf("Sum = %.2f%n",sum);
        double allSum = sum / n;
        System.out.printf("Media = %.2f%n",allSum);







    }
}