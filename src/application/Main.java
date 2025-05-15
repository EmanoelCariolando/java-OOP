package application;

import entities.Persons;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print(" How Many Numbers Will You Type? ");
        int n = sc.nextInt();

        Persons[] p = new Persons[n];


        for (int i =0; i<n; i++){
          System.out.print(" Name: ");
          String names = sc.next();
          System.out.print(" Age: ");
          int age = sc.nextInt();
          System.out.print(" Height: ");
          double height = sc.nextDouble();
           p[i] = new Persons(names,age,height);
        }

        int counter = 0;
        double getter = 0.0;

        for (int i =0; i<n; i++){
            getter += p[i].getHeight();
          if(p[i].getAge() < 16 ){
            counter++;
          }
        }
        double sum = getter / n;
        System.out.printf("Average Height: %.2f%n",sum);
        double agePercentage = ((double)counter / n) * 100;
        System.out.printf("people under 16 years of age: %.1f%%%n",agePercentage);

        for (int i =0; i<n; i++){
            if(p[i].getAge() < 16 ){
                System.out.println(p[i].getName());
            }
        }

        /*
        Exemplo:
 Quantas pessoas serao digitadas? 5
 Joao
 15
 1.82
 Maria
 16
 1.60
 Teresa
 14
 1.58
 Carlos
 21
 1.65
 Paulo
 17
 1.78
*/



    }
}