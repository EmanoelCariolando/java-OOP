package application;


import entities.Department;
import entities.HourContract;
import entities.Worker;
import entitiesEnum.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws ParseException {
                Locale.setDefault(Locale.US);
                Scanner sc = new Scanner(System.in);
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

                System.out.println("Enter the department's name: ");
                String department = sc.next();
                System.out.println("Enter the worker's data: ");
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Level: ");
                String level = sc.next();
                System.out.print("Base Salary: ");
                Double baseSalary = sc.nextDouble();

                Worker worker = new Worker(name,WorkerLevel.valueOf(level),baseSalary,new Department(department));

                System.out.print("Number of Contracts: ");
                Integer numberOfContracts = sc.nextInt();


                for (int i = 0; i < numberOfContracts; i++) {
                        System.out.println("Enter contract #" + (i + 1) + " data: ");
                        System.out.print("Date (dd/MM/yyyy): ");
                        Date dates = sdf.parse(sc.next());
                        System.out.print("Value per hour: ");
                        Double valuePerHour = sc.nextDouble();
                        System.out.print("Duration(hours): ");
                        Integer hours = sc.nextInt();

                        HourContract con = new HourContract(dates,valuePerHour,hours);
                        worker.addContract(con);
                }

                System.out.println("Enter month and year to calculate salary: (MM/YYYY)");
                String monthYear = sc.next();
                int month = Integer.parseInt(monthYear.substring(0,2));
                int year = Integer.parseInt(monthYear.substring(3));
                double sums = worker.income(year,month);

                System.out.println("Name: " + worker.getName());
                System.out.println("Department: " + worker.getDepartment());

                System.out.printf("Income for %d/%d: $ %.2f%n",month,year,sums);

                sc.close();


        }
}





