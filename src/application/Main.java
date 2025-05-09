package application;

import entities.otherClass;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        otherClass other = new otherClass();

        System.out.println("Name:");
        other.name = sc.nextLine();

        System.out.println("Gross salary:");
        other.grossSalary = sc.nextDouble();

        System.out.println("Tax:");
        other.tax = sc.nextDouble();

        System.out.println("Employee:" + other);

        System.out.println("Which percentage to increase salary?:");
        other.increaseSalary(sc.nextDouble());

        System.out.println("Update data:" + other);



        sc.close();

        }
    }