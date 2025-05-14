package application;

import entities.Products;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Products[] v = new Products[n];

        for (int i =0; i<n; i++){
            String name = sc.next();
            double price = sc.nextDouble();
            v[i] = new Products(name,price);
        }


        double sum = 0.0;

        for (int i =0; i<n; i++){
           sum += v[i].getPrice();
        }
        double all = sum / n;

        System.out.printf("AVERAGE PRICE = %.2f%n",all);



        sc.close();

    }
}