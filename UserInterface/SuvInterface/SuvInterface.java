package UserInterface.SuvInterface;

import java.util.Scanner;

import Validation;

public class SuvInterface {

    private static String bullet = "\u2022";

    public static void addSuvIntheList(Scanner sc, Suvlist suvList, Validation v) {
        System.out.print("\t" + bullet + " Enter the name of the SUV: ");
        String name = sc.nextLine();

        System.out.print("\t" + bullet + " Enter the speed of the SUV: ");
        int speed = sc.nextInt();
        if (!v.validateSpeed(speed)) {
            return;
        }

        System.out.print("\t" + bullet + " Enter the price of the SUV: ");
        double price = sc.nextDouble();
        sc.nextLine();
        if (!v.validatePrice(price)) {
            return;
        }

        System.out.print("\t" + bullet + " Enter the color of the SUV: ");
        String color = sc.nextLine();
        if (!v.validateColor(color)) {
            return;
        }

        System.out.print("\t" + bullet + " Enter the mileage of the SUV: ");
        double mileage = sc.nextDouble();
        sc.nextLine();
        if (!v.validateMileage(mileage)) {
            return;
        }

        System.out.print("\t" + bullet + " Enter the fuel type of the SUV: ");
        String fuelType = sc.nextLine();
        if (!v.validateFuelType(fuelType)) {
            return;
        }

        System.out.print("\t" + bullet + " Enter the year of the SUV: ");
        String year = sc.nextLine();
        if (!v.validateYear(year)) {
            return;
        }

        System.out.print("\t" + bullet + " Enter the weight of the SUV: ");
        int weight = sc.nextInt();
        sc.nextLine();
        if (!v.validateWeight(weight)) {
            return;
        }

        Suv suv = new Suv(name, speed, price, color, mileage, fuelType, year, weight);
        suvList.addSuv(suv);
    }

    public static void suvOptions() {
        Scanner sc = new Scanner(System.in);
        boolean isValidCondition = false;
        Validation validation = new Validation();
        Suvlist suvlist = new Suvlist();
        while (!isValidCondition) {
            System.out.println("===========||SUV||=============" + "\n" +
                    "|| 1. Add SUV details        ||" + "\n" + //
                    "|| 2. View SUVs              ||" + "\n" +
                    "|| 3. Search SUV             ||" + "\n" +
                    "|| 4. Remove SUV             ||" + "\n" +
                    "|| 5. Return to main menu    ||" + "\n" +
                    "==============================");
            // String bullet = "\u2022";
            System.out.print(bullet + "Enter Your choice for SUV: ");
            int SUVoption = sc.nextInt();
            sc.nextLine();

            switch (SUVoption) {
                case 1:
                    addSuvIntheList(sc, suvlist, validation);
                    break;
                case 2:
                    suvlist.displaySuv();
                    break;
                case 3:
                    SuvSearchInterface.searchOption();
                    break;
                case 4:
                    System.out.print("\t" + bullet + " Give the name of the car you want to remove: ");
                    String carName = sc.nextLine();
                    suvlist.removeSuvByName(carName);
                case 5:
                    isValidCondition = true;
                    break;
                default:
                    break;
            }
        }
    }
}
