
import java.util.NoSuchElementException;
import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isValidCondition = false;

        while (!isValidCondition) {
            System.out.println("\t\t\t" + "=+=== Welcome to AutoShop ====+=");
            System.out.println("\t\t\t" + "|| 1. Suv option               ||" + "\n" +
                    "\t\t\t" + "|| 2. Sedan option             ||" + "\n" +
                    "\t\t\t" + "|| 3. Exit                     ||" + "\n" +
                    "\t\t\t" + "=+============================+=");
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
                            System.out.println("|| Application Closed Successfully! ||");
                            break;
                        default:
                            System.err.println("|| Invalid option. Please try again. ||");
                            break;
                    }
                } else {
                    System.err.println("|| Invalid input. Please enter a number. ||");
                }

            } catch (NoSuchElementException e) {
                System.err.println("|| No input provided. Please try again. ||");
            } catch (Exception e) {
                System.err.println("An unexpected error occurred: " + e.getMessage());
            }
        }

        sc.close();
    }
}
