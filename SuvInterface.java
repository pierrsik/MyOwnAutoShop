import java.util.Scanner;

public class SuvInterface {

    public static void addSuvIntheList(Scanner sc, Suvlist suvList, Validation v) {
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
        String color = sc.nextLine();
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
        String fuelType = sc.nextLine();
        if (!v.validateFuelType(fuelType)) {
            return;
        }

        System.out.println("Enter the year of the SUV: ");
        String year = sc.nextLine();
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

    public static void suvOptions() {
        Scanner sc = new Scanner(System.in);
        boolean isValidCondition = false;
        Validation validation = new Validation();
        Suvlist suvlist = new Suvlist();
        while (!isValidCondition) {
            System.out.println("1. Add SUV\n2. View SUVs\n3. Search SUV\n4. Remove \n5.Return to main menu");
            System.out.print("Enter Your choice for SUV: ");
            int SUVoption = sc.nextInt();
            sc.nextLine();
            switch (SUVoption) {
                case 1:
                    addSuvIntheList(sc, suvlist, validation);
                    break;
                case 2:
                    suvlist.displaySuv();
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
