import java.util.Scanner;

public class SedanInterface {

    public static void addSedanIntheList(Scanner sc, Sedanlist sedanlist, Validation v) {
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

        System.out.println("Enter the manafacturer Discount of the SUV: ");
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
        System.out.println("1. Add SUV\n2. View SUVs\n3. Search SUV\n4. Remove \n5.Return to main menu");
        System.out.print("Enter Your choice for SUV: ");
        int SUVoption = Integer.parseInt(sc.next());
        Validation validation = new Validation();
        Sedanlist sedanlist = new Sedanlist();
        switch (SUVoption) {
            case 1:
                addSedanIntheList(sc, sedanlist, validation);
                break;

            default:
                break;
        }
    }
}
