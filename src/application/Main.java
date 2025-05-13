package application;

import entities.Products;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double initialDeposit;
        Products p;

        System.out.println("Enter account number");
        int acNumber = sc.nextInt();

        System.out.println("Enter account holder");
        String name = sc.next();

        System.out.println("Is there na initial deposit (y/n)?");
        char question = sc.next().charAt(0);

        if (question == 'y'){
            System.out.println("Enter initial deposit value: ");
             initialDeposit = sc.nextDouble();
            p = new Products(acNumber,name,initialDeposit);

        } else  {
            p = new Products(acNumber,name);
          
        }

        System.out.println(p);

        System.out.println("Enter a deposit value:");
        double newDeposit = sc.nextDouble();
        p.deposit(newDeposit);

        System.out.println(p);

        System.out.println("Enter a withdraw value: ");
        double withDraw = sc.nextDouble();
        p.withdraw(withDraw);

        System.out.println(p);
















        sc.close();

    }
}