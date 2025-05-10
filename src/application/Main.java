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


        System.out.println("Enter radius:");
        double radius = sc.nextDouble();

        double c = otherClass.circumference(radius);
        System.out.printf("Circumference:%.2f%n",c);

        double v = otherClass.volume(radius);
        System.out.printf("Volume:%.2f%n",v);


        sc.close();

        }



    }