
import java.util.Scanner;

public class SedanInterface {

    public static void addSedanIntheList(Scanner sc, Sedanlist sedanlist, Validation v) {
        System.out.print("\t" + "* Enter the name of the Sedan: ");
        String name = sc.nextLine();

        System.out.print("\t" + "* Enter the speed of the Sedan(in kmph): ");
        int speed = sc.nextInt();
        while (!v.validateSpeed(speed)) {
            System.out.print("\t" + "* Enter the speed of the Sedan(in kmph): ");
            speed = sc.nextInt();
        }

        System.out.print("\t" + "* Enter the price of the Sedan(in Rs): ");
        double price = sc.nextDouble();
        sc.nextLine();
        while (!v.validatePrice(price)) {
            System.out.print("\t" + "* Enter the price of the Sedan(in Rs): ");
            price = sc.nextDouble();
            sc.nextLine();
        }

        System.out.print("\t" + "* Enter the color of the Sedan: ");
        String color = sc.nextLine();
        while (!v.validateColor(color)) {
            System.out.print("\t" + "* Enter the color of the Sedan: ");
            color = sc.nextLine();
        }

        System.out.print("\t" + "* Enter the mileage of the Sedan(10-50 km/l): ");
        double mileage = sc.nextDouble();
        sc.nextLine();
        while (!v.validateMileage(mileage)) {
            System.out.print("\t" + "* Enter the mileage of the Sedan(10-50 km/l): ");
            mileage = sc.nextDouble();
            sc.nextLine();
        }

        System.out.print("\t" + "* Enter the fuel type of the Sedan(petrol/deisel): ");
        String fuelType = sc.nextLine();
        while (!v.validateFuelType(fuelType)) {
            System.out.print("\t" + " Enter the fuel type of the Sedan(petrol/deisel): ");
            fuelType = sc.nextLine();
        }

        System.out.print("\t" + "* Enter the year of the Sedan(1950-2025): ");
        String year = sc.nextLine();
        while (!v.validateYear(year)) {
            System.out.print("\t" + "* Enter the year of the Sedan(1950-2025): ");
            year = sc.nextLine();
        }

        System.out.print("\t" + "* Enter the manufacturer Discount of the Sedan(in %): ");
        double manufacturerDiscount = sc.nextDouble();
        sc.nextLine();
        while (!v.validateManufacturerDiscount(manufacturerDiscount)) {
            System.out.print("\t" + "* Enter the manufacturer Discount of the Sedan(in %): ");
            manufacturerDiscount = sc.nextDouble();
            sc.nextLine();
        }

        Sedan sedan = new Sedan(name, speed, price, color, mileage, fuelType, year, manufacturerDiscount);
        sedanlist.addSedan(sedan);
    }

    public static void sedanOptions(Scanner sc) {
        boolean isValidCondition = false;
        Validation validation = new Validation();
        Sedanlist sedanlist = new Sedanlist();
        while (!isValidCondition) {
            System.out.println("\t\t\t" + "==========||Sedan||============" + "\n" +
                    "\t\t\t" + "|| 1. Add Sedan details      ||" + "\n" +
                    "\t\t\t" + "|| 2. View Sedans            ||" + "\n" +
                    "\t\t\t" + "|| 3. Search Sedan           ||" + "\n" +
                    "\t\t\t" + "|| 4. Remove Sedan           ||" + "\n" +
                    "\t\t\t" + "|| 5. Return to main menu    ||" + "\n" +
                    "\t\t\t" + "==============================");
            System.out.print("Enter Your choice for Sedan: ");
            int Sedanoption = sc.nextInt();
            sc.nextLine();

            switch (Sedanoption) {
                case 1:
                    addSedanIntheList(sc, sedanlist, validation);
                    System.out.println("|| Sedan added successfully ||");
                    break;
                case 2:
                    sedanlist.displaySedan(sedanlist.getSedanList());
                    break;
                case 3:
                    SedanSearchInterface.searchOption(sedanlist, sc);
                    break;
                case 4:
                    System.out.print("\t" + "* Give the name of the car you want to remove: ");
                    String carName = sc.nextLine();
                    sedanlist.removeSedanByName(carName);
                    System.out.println("|| Sedan removed successfully ||");
                    break;
                case 5:
                    isValidCondition = true;
                    break;
                default:
                    System.err.println("|| Invalid option. Please try again. ||");
                    break;
            }

        }
    }
}
