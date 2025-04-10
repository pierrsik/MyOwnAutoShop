package userInterface;

import java.util.NoSuchElementException;
import java.util.Scanner;

import userInterface.sedanInterface.SedanInterface;
import userInterface.suvInterface.SuvInterface;

public class UserInterface {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isValidCondition = false;

        while (!isValidCondition) {
            System.out.println("=+=== Welcome to AutoShop ====+=");
            System.out.println("|| 1. Suv option               ||" + "\n" +
                    "|| 2. Sedan option             ||" + "\n" +
                    "|| 3. Exit                     ||" + "\n" +
                    "=+============================+=");
            System.out.print("* Enter Your choice: ");
            try {
                if (sc.hasNextInt()) {
                    int option = sc.nextInt();
                    sc.nextLine(); // Consume the newline character

                    switch (option) {
                        case 1:
                            SuvInterface.suvOptions(sc);
                            break;
                        case 2:
                            SedanInterface.sedanOptions(sc);
                            break;
                        case 3:
                            isValidCondition = true;
                            break;
                        default:
                            System.out.println("Invalid option. Please try again.");
                            break;
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                }

            } catch (NoSuchElementException e) {
                System.out.println("No input provided. Please try again.");
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }

        sc.close();
    }
}
