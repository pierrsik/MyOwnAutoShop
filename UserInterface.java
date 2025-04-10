import java.util.Scanner;

public class UserInterface {

<<<<<<< HEAD
=======
    public static void addSuv(Scanner sc, Suvlist suvList, Validation v) {

        System.out.println("Enter the name of the SUV: ");
        String name = sc.nextLine();

        System.out.println("Enter the speed of the SUV: ");
        int speed = sc.nextInt();
        if (!v.validateSpeed(speed)) {
            return;
        }

        System.out.println("Enter the price of the SUV: ");
        double price = sc.nextDouble();
        sc.nextLine();
        if (!v.validatePrice(price)) {
            return;
        }

        System.out.println("Enter the color of the SUV: ");
        String color = sc.next();
        sc.nextLine();
        if (!v.validateColor(color)) {
            return;
        }

        System.out.println("Enter the mileage of the SUV: ");
        double mileage = sc.nextDouble();
        sc.nextLine();
        if (!v.validateMileage(mileage)) {
            return;
        }

        System.out.println("Enter the fuel type of the SUV: ");
        String fuelType = sc.next();
        sc.nextLine();
        if (!v.validateFuelType(fuelType)) {
            return;
        }

        System.out.println("Enter the year of the SUV: ");
        String year = sc.next();
        sc.nextLine();
        if (!v.validateYear(year)) {
            return;
        }

        System.out.println("Enter the weight of the SUV: ");
        int weight = sc.nextInt();
        sc.nextLine();
        if (!v.validateWeight(weight)) {
            return;
        }

        Suv suv = new Suv(name, speed, price, color, mileage, fuelType, year, weight);
        suvList.addSuv(suv);
    }

    public static void addSedan(Scanner sc, Sedanlist sedanlist, Validation v) {

        System.out.println("Enter the name of the Sedan: ");
        String name = sc.nextLine();

        System.out.println("Enter the speed of the Sedan: ");
        int speed = sc.nextInt();
        if (!v.validateSpeed(speed)) {
            return;
        }

        System.out.println("Enter the price of the Sedan: ");
        double price = sc.nextDouble();
        sc.nextLine();
        if (!v.validatePrice(price)) {
            return;
        }

        System.out.println("Enter the color of the Sedan: ");
        String color = sc.next();
        sc.nextLine();
        if (!v.validateColor(color)) {
            return;
        }

        System.out.println("Enter the mileage of the Sedan: ");
        double mileage = sc.nextDouble();
        sc.nextLine();
        if (!v.validateMileage(mileage)) {
            return;
        }

        System.out.println("Enter the fuel type of the Sedan: ");
        String fuelType = sc.next();
        sc.nextLine();
        if (!v.validateFuelType(fuelType)) {
            return;
        }

        System.out.println("Enter the year of the Sedan: ");
        String year = sc.next();
        sc.nextLine();
        if (!v.validateYear(year)) {
            return;
        }

        System.out.println("Enter the Discount rate of the SUV: ");
        double manafacturerDiscount = sc.nextDouble();
        sc.nextLine();
        if (!v.validateManafacturerDiscount(manafacturerDiscount)) {
            return;
        }

        Sedan sedan = new Sedan(name, speed, price, color, mileage, fuelType, year, manafacturerDiscount);
        sedanlist.addSedan(sedan);
    }

>>>>>>> 9711e49667f1633990b15bff56e3a5c66d2f8a4c
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isValidCondition = false;

        while (!isValidCondition) {
            System.out.println("Welcome to AutoShop ");
            System.out.println("1. Suv option\n2.Sedan option\n3.Exit");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                // SUV case
                case 1:
                    SuvInterface.suvOptions();
                    break;

                case 2:
                    SedanInterface.sedanOptions();

                case 3:
                    isValidCondition = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }

        }

    }
}
