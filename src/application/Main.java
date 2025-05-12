package application;

import entities.Products;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data");
        System.out.println("Name:");
        String name = sc.next();

        System.out.println("Price:");
        double price = sc.nextDouble();

        System.out.println("Quantity:");
        int quantity = sc.nextInt();


        Products product = new Products(name,price,quantity);
        product.setName("Computer");
        product.setPrice(902.00);

        System.out.println("New product:" + product.getName() + " , " + "new price:" + product.getPrice());

        System.out.println(product);

        System.out.println("Enter the number of products to be added in stock:");
        product.addProducts(sc.nextInt());

        System.out.println(product);



        System.out.println("Enter the number of products to be removed from stock:");
        product.removeProducts(sc.nextInt());

        System.out.println(product);


        sc.close();

    }
}