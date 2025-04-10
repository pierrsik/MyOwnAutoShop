package userInterface.sedanInterface;

import java.util.Scanner;

import sedan.Sedanlist;

public class SedanSearchInterface {
    public static String bullet = "\u2022";

    public static void searchOption() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======|| Search for Sedan ||=======" + "\n" +
                "|| 1. Search by company name     ||" + "\n" +
                "|| 2. Search by Sedan color      ||" + "\n" +
                "|| 3. Search by Fuel Type        ||" + "\n" +
                "|| 4. Search by year             ||" + "\n" +
                "|| 5. Search by min Speed        ||" + "\n" +
                "|| 6. Search by sales Price      ||" + "\n" +
                "==================================" + "\n");
        System.out.print("\t" + bullet + " Enter the option for Sedean: ");
        int key = sc.nextInt();
        sc.nextLine();
        Sedanlist sedanlist = new Sedanlist();
        switch (key) {
            case 1:
                System.out.print("\t" + bullet + " Enter the sedan's Company name: ");
                String companyName = sc.nextLine();
                sedanlist.filterByName(companyName);
                sedanlist.displaySedan(sedanlist.getFilteredData());

                break;

            default:
                break;
        }

        sc.close();
    }
}
