import java.util.Scanner;

public class UserInterface {

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
