package userInterface.sedanInterface;

import java.util.Scanner;

import sedan.Sedan;
import sedan.Sedanlist;
import validation.Validation;

public class SedanInterface {
    private static String bullet = "\u2022";

    public static void addSedanIntheList(Scanner sc, Sedanlist sedanlist, Validation v) {
        System.out.print("\t" + bullet + " Enter the name of the Sedan: ");
        String name = sc.nextLine();

        System.out.print("\t" + bullet + " Enter the speed of the Sedan: ");
        int speed = sc.nextInt();
        if (!v.validateSpeed(speed)) {
            return;
        }

        System.out.print("\t" + bullet + " Enter the price of the Sedan: ");
        double price = sc.nextDouble();
        sc.nextLine();
        if (!v.validatePrice(price)) {
            return;
        }

        System.out.print("\t" + bullet + " Enter the color of the Sedan: ");
        String color = sc.next();
        sc.nextLine();
        if (!v.validateColor(color)) {
            return;
        }

        System.out.print("\t" + bullet + " Enter the mileage of the Sedan: ");
        double mileage = sc.nextDouble();
        sc.nextLine();
        if (!v.validateMileage(mileage)) {
            return;
        }

        System.out.print("\t" + bullet + " Enter the fuel type of the Sedan: ");
        String fuelType = sc.next();
        sc.nextLine();
        if (!v.validateFuelType(fuelType)) {
            return;
        }

        System.out.print("\t" + bullet + " Enter the year of the Sedan: ");
        String year = sc.next();
        sc.nextLine();
        if (!v.validateYear(year)) {
            return;
        }

        System.out.print("\t" + bullet + " Enter the manafacturer Discount of the SUV: ");
        int manafacturerDiscount = sc.nextInt();
        sc.nextLine();
        if (!v.validateManafacturerDiscount(manafacturerDiscount)) {
            return;
        }

        Sedan sedan = new Sedan(name, speed, price, color, mileage, fuelType, year, manafacturerDiscount);
        sedanlist.addSedan(sedan);
    }

    public static void sedanOptions() {
        Scanner sc = new Scanner(System.in);
        boolean isValidCondition = false;
        Validation validation = new Validation();
        Sedanlist sedanlist = new Sedanlist();
        while (!isValidCondition) {
            System.out.println("==========||Sedan||============" + "\n" +
                    "|| 1. Add Sedan details      ||" + "\n" + //
                    "|| 2. View Sedans            ||" + "\n" +
                    "|| 3. Search Sedan           ||" + "\n" +
                    "|| 4. Remove Sedan           ||" + "\n" +
                    "|| 5. Return to main menu    ||" + "\n" +
                    "==============================");
            // String bullet = "\u2022";
            System.out.print(bullet + "Enter Your choice for Sedan: ");
            int Sedanoption = sc.nextInt();
            sc.nextLine();

            switch (Sedanoption) {
                case 1:
                    addSedanIntheList(sc, sedanlist, validation);
                    break;
                case 2:
                    sedanlist.displaySedan(sedanlist.getSedanList());
                    break;
                case 3:
                    SedanSearchInterface.searchOption();
                    break;
                case 4:
                    System.out.print("\t" + bullet + " Give the name of the car you want to remove: ");
                    String carName = sc.nextLine();
                    sedanlist.removeSedanByName(carName);
                case 5:
                    isValidCondition = true;
                    break;
                default:
                    break;
            }

        }
    }
}
