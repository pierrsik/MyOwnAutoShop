
import java.util.Scanner;

public class SedanSearchInterface {

    public static void searchOption(Sedanlist sedanlist, Scanner sc) {
        boolean searchCondition = false;
        while (!searchCondition) {
            System.out.println("=======|| Search for Sedan ||=======" + "\n" +
                    "|| 1. Search by company name     ||" + "\n" +
                    "|| 2. Search by Sedan color      ||" + "\n" +
                    "|| 3. Search by Fuel Type        ||" + "\n" +
                    "|| 4. Search by year             ||" + "\n" +
                    "|| 5. Search by min Speed        ||" + "\n" +
                    "|| 6. Search by sales Price      ||" + "\n" +
                    "|| 7. Return Back                ||" + "\n" +
                    "==================================" + "\n");
            System.out.print("\t* Enter the option for Sedan: ");
            int key = sc.nextInt();
            sc.nextLine();
            switch (key) {
                case 1:
                    System.out.print("\t* Enter the sedan's Company name: ");
                    String companyName = sc.nextLine();
                    sedanlist.filterByName(companyName);
                    sedanlist.displaySedan(sedanlist.getFilteredData());
                    break;

                case 2:
                    System.out.print("\t* Enter the sedan's color: ");
                    String color = sc.nextLine();
                    sedanlist.filterByColor(color);
                    sedanlist.displaySedan(sedanlist.getFilteredData());
                    break;

                case 3:
                    System.out.print("\t* Enter the sedan's fuel type: ");
                    String fuelType = sc.nextLine();
                    sedanlist.filterByFuelType(fuelType);
                    sedanlist.displaySedan(sedanlist.getFilteredData());
                    break;

                case 4:
                    System.out.print("\t* Enter the sedan's year: ");
                    String year = sc.nextLine();
                    sedanlist.filterByYear(year);
                    sedanlist.displaySedan(sedanlist.getFilteredData());
                    break;

                case 5:
                    System.out.print("\t* Enter the sedan's minimum speed: ");
                    double minSpeed = sc.nextDouble();
                    sc.nextLine();
                    sedanlist.filterBySpeed(minSpeed);
                    sedanlist.displaySedan(sedanlist.getFilteredData());
                    break;

                case 6:
                    System.out.print("\t* Enter the sedan's sales price: ");
                    double salesPrice = sc.nextDouble();
                    sc.nextLine();
                    sedanlist.filterBySalePrice(salesPrice);
                    sedanlist.displaySedan(sedanlist.getFilteredData());
                    break;

                case 7:
                    searchCondition = true;
                    break;

                default:
                    System.err.println("|| Invalid option!!!Please try again ||");
                    break;
            }
        }
    }
}
