package application;

import entities.Products;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Products product = new Products();

        System.out.println("Enter product data");
        System.out.println("Name:");
        product.name = sc.next();

        System.out.println("Price:");
        product.price = sc.nextDouble();

        System.out.println("Quantity:");
        product.quantity = sc.nextInt();

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