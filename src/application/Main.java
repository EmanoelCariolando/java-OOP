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

        System.out.println("What is the dollar price?");
        double dollar = sc.nextDouble();
        System.out.println("how many dollars will be bought?");
        double howMany = sc.nextDouble();
        otherClass.dollarCost(dollar,howMany);

        System.out.printf("Amount to be paid in real: %.2f", otherClass.sumIof(dollar,howMany));

        sc.close();

        }

    }