

import java.util.Scanner;

public class SuvInterface {

    public static void addSuvIntheList(Scanner sc, Suvlist suvList, Validation v) {
        System.out.print("\t Enter the name of the SUV: ");
        String name = sc.nextLine();

        System.out.print("\t Enter the speed of the SUV:(in kmph) ");
        int speed = sc.nextInt();
        while (!v.validateSpeed(speed)) {
            System.out.print("\t Enter the speed of the SUV:(in kmph) ");
            speed = sc.nextInt();
            sc.nextLine();
        }

        System.out.print("\t Enter the price of the SUV(in Rs): ");
        double price = sc.nextDouble();
        sc.nextLine();
        while (!v.validatePrice(price)) {
            System.out.print("\t Enter the price of the SUV(in Rs): ");
            price = sc.nextDouble();
            sc.nextLine();
        }

        System.out.print("\t Enter the color of the SUV: ");
        String color = sc.nextLine();
        while (!v.validateColor(color)) {
            System.out.print("\t Enter the color of the SUV: ");
            color = sc.nextLine();
        }

        System.out.print("\t Enter the mileage of the SUV(0-50): ");
        double mileage = sc.nextDouble();
        sc.nextLine();
        while (!v.validateMileage(mileage)) {
            System.out.print("\t Enter the mileage of the SUV(0-50): ");
            mileage = sc.nextDouble();
            sc.nextLine();
        }

        System.out.print("\t Enter the fuel type of the SUV(petrol/deisel): ");
        String fuelType = sc.nextLine();
        while (!v.validateFuelType(fuelType)) {
            System.out.print("\t Enter the fuel type of the SUV(petrol/deisel): ");
            fuelType = sc.nextLine();
        }

        System.out.print("\t Enter the year of the SUV(1950-2025): ");
        String year = sc.nextLine();
        while (!v.validateYear(year)) {
            System.out.print("\t Enter the year of the SUV(1950-2025): ");
            year = sc.nextLine();
        }

        System.out.print("\t Enter the weight of the SUV(in Kg): ");
        int weight = sc.nextInt();
        sc.nextLine();
        while (!v.validateWeight(weight)) {
            System.out.print("\t Enter the weight of the SUV(in Kg): ");
            weight = sc.nextInt();
            sc.nextLine();
        }

        Suv suv = new Suv(name, speed, price, color, mileage, fuelType, year, weight);
        suvList.addSuv(suv);
    }

    public static void suvOptions(Scanner sc) {
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
            System.out.print("Enter Your choice for SUV: ");
            int SUVoption = sc.nextInt();
            sc.nextLine();

            switch (SUVoption) {
                case 1:
                    addSuvIntheList(sc, suvlist, validation);
                    break;
                case 2:
                    suvlist.displaySUV(suvlist.getSuvList());
                    break;
                case 3:
                    SuvSearchInterface.searchOption(suvlist, sc);
                    break;
                case 4:
                    System.out.print("\t Give the name of the car you want to remove: ");
                    String carName = sc.nextLine();
                    suvlist.removeSuvByName(carName);
                    break;
                case 5:
                    isValidCondition = true;
                    break;
                default:
                    break;
            }
        }
    }
}
