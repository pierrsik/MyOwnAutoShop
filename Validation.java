
import java.util.ArrayList;
import java.util.Arrays;

public class Validation {

    private static ArrayList<String> validColors = new ArrayList<>(
            Arrays.asList("red", "blue", "white", "grey", "black", "green", "yellow", "purple", "orange", "pink",
                    "brown"));

    public boolean validateSpeed(int speed) {
        if (speed < 0) {
            System.out.println("Speed can not be negative");
            return false;
        } else if (speed > 250) {
            System.out.println("Speed must be less than 250");
            return false;
        } else {
            return true;
        }
    }

    public boolean validatePrice(double price) {
        double minPrice = 0.0;
        double maxPrice = 100000000.0;
        if (price < minPrice) {
            System.out.println("Price must not be negative");
            return false;
        } else if (price > maxPrice) {
            System.out.println("Price must be reasonable");
            return false;
        } else {
            return true;
        }

    }

    public boolean validateColor(String color) {
        if (color == null || color.isEmpty()) {
            System.out.println("Color cannot be empty.");
            return false;
        }
        color = color.toLowerCase();
        if (validColors.contains(color)) {
            return true;
        } else {
            System.out.println("That color option is not offered");
            return false;
        }

    }

    public boolean validateType(String type) {
        type = type.toLowerCase();
        if (!type.equals("suv") && !type.equals("sedan")) {
            System.out.println("That type of Car option is not offered");
            return false;
        } else {
            return true;
        }
    }

    public boolean validateMileage(double mileage) {
        double minMileage = 0.0;
        double maxMileage = 50.0;
        if (mileage < minMileage) {
            System.out.println("Mileage must not be negative");
            return false;
        } else if (mileage > maxMileage) {
            System.out.println("Mileage must be reasonable");
            return false;
        } else {
            return true;
        }
    }

    public boolean validateFuelType(String fuelType) {

        fuelType = fuelType.toLowerCase();
        if (!fuelType.equals("petrol") && !fuelType.equals("diesel")) {
            System.out.println("That fuel vehicle is not invented yet!!");
            return false;
        } else {
            return true;
        }

    }

    public boolean validateYear(String year) {
        // Check if the year is a 4-digit number
        if (year.matches("\\d{4}")) {
            int yearInt = Integer.parseInt(year);
            // Check if the year is within a reasonable range (e.g., 1000 to 9999)
            if (yearInt >= 1950 && yearInt <= 2025)
                return true;
            else {
                System.out.println("Please enter reasonable year value");
                return false;
            }
        } else {
            System.out.println("Enter valid input");
            return false;
        }
    }

    public boolean validateManufacturerDiscount(double manafacturerDiscount) {
        double minManafacturerDiscount = 0.0;
        double maxManafacturerDiscount = 100000.0;
        if (manafacturerDiscount < minManafacturerDiscount) {
            System.out.println("Discount can not be negative");
            return false;
        } else if (manafacturerDiscount > maxManafacturerDiscount) {
            System.out.println("Our AutoShop needs to be profitable, please reconsider!");
            return false;
        } else {
            return true;
        }
    }

    public boolean validateWeight(int weight) {
        if (weight <= 0) {
            System.out.println("Weight must be positive");
            return false;
        } else if (weight > 6000) {
            System.out.println("Weight must be reasonable");
            return false;
        } else {
            return true;
        }
    }

}
