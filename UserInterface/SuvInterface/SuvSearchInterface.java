package userInterface.suvInterface;

import java.util.Scanner;

import suv.Suvlist;

public class SuvSearchInterface {
    public static void searchOption(Suvlist suvList, Scanner sc) {
        boolean searchCondition = false;
        while (!searchCondition) {
            System.out.println("=======|| Search for SUV ||=======" + "\n" +
                    "|| 1. Search by company name     ||" + "\n" +
                    "|| 2. Search by SUV color        ||" + "\n" +
                    "|| 3. Search by Fuel Type        ||" + "\n" +
                    "|| 4. Search by Weight           ||" + "\n" +
                    "|| 5. Search by year             ||" + "\n" +
                    "|| 6. Search by max Speed        ||" + "\n" +
                    "|| 7. Search by sales Price      ||" + "\n" +
                    "|| 8. Exit                       ||" + "\n" +
                    "==================================" + "\n");

            System.out.print("\t Enter the option for SUV: ");
            int key = sc.nextInt();
            sc.nextLine();

            switch (key) {
                case 1:
                    System.out.print("\t Enter the SUV's Company name: ");
                    String companyName = sc.nextLine();
                    suvList.filterByName(companyName);
                    suvList.displaySUV(suvList.getFilteredData());
                    break;

                case 2:
                    String color = sc.nextLine();
                    suvList.filterByColor(color);
                    suvList.displaySUV(suvList.getFilteredData());
                    break;

                case 3:
                    System.out.print("\t Enter the sedan's fuel type: ");
                    String fuelType = sc.nextLine();
                    suvList.filterByFuelType(fuelType);
                    suvList.displaySUV(suvList.getFilteredData());
                    break;

                case 5:
                    System.out.print("\t Enter the sedan's year: ");
                    String year = sc.nextLine();
                    suvList.filterByYear(year);
                    suvList.displaySUV(suvList.getFilteredData());
                    break;

                case 6:
                    System.out.print("\t Enter the sedan's minimum speed: ");
                    double maxSpeed = sc.nextDouble();
                    sc.nextLine();
                    suvList.filterBySpeed(maxSpeed);
                    suvList.displaySUV(suvList.getFilteredData());
                    break;

                case 7:
                    System.out.print("\t Enter the sedan's sales price: ");
                    double salesPrice = sc.nextDouble();
                    sc.nextLine();
                    suvList.filterBySalePrice(salesPrice);
                    suvList.displaySUV(suvList.getFilteredData());
                    break;

                case 8:
                    searchCondition = true;
                    break;

                default:
                    break;
            }
        }
    }
}
