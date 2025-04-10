package UserInterface;

import java.util.Scanner;

import UserInterface.SedanInterface.SedanInterface;
import UserInterface.SuvInterface.SuvInterface;

public class UserInterface {

    public static String bullet = "\u2022";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isValidCondition = false;

        while (!isValidCondition) {
            System.out.println("=+=== Welcome to AutoShop ====+=");
            System.out.println("|| 1. Suv option             ||" + "\n" +
                    "|| 2. Sedan option            ||" + "\n" +
                    "|| 3. Exit                    ||" + "\n" +
                    "=+============================+=");
            System.out.print(bullet + " Enter Your coice: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                // SUV case
                case 1:
                    SuvInterface.suvOptions();
                    break;

                case 2:
                    SedanInterface.sedanOptions();
                    break;
                case 3:
                    isValidCondition = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }

        }
        sc.close();
    }
}
