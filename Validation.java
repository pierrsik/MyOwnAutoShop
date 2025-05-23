
import java.util.ArrayList;
import java.util.Arrays;

public class Validation {

    private static ArrayList<String> validColors = new ArrayList<>(
            Arrays.asList("red", "blue", "white", "grey", "black", "green", "yellow", "purple", "orange", "pink",
                    "brown"));

    public boolean validateSpeed(int speed) {
        if (speed < 80) {
            System.err.println("Speed must be atleast 80 km/h");
            return false;
        } else if (speed > 250) {
            System.err.println("Speed must be less than 250km/h");
            return false;
        } else {
            return true;
        }
    }

    public boolean validateName(String name) {
        if (name == null || name.isEmpty()) {
            System.err.println("Name cannot be empty.");
            return false;
        } else if (name.length() < 3) {
            System.err.println("Name must be atleast 3 characters long.");
            return false;
        } else if (!name.matches("[A-Za-z0-9][A-Za-z0-9 ]*")) {
            System.err.println("Name must only contain letters and numbers.");
            return false;
        } else {
            return true;
        }
    }

    public boolean validatePrice(double price) {
        double minPrice = 300000.0;
        double maxPrice = 100000000.0;
        if (price < minPrice) {
            System.err.println("Price must not be less than 3 lakhs");
            return false;
        } else if (price > maxPrice) {
            System.err.println("Price must be reasonable");
            return false;
        } else {
            return true;
        }

    }

    public boolean validateColor(String color) {
        if (color == null || color.isEmpty()) {
            System.err.println("Color cannot be empty.");
            return false;
        }
        color = color.toLowerCase();
        if (validColors.contains(color)) {
            return true;
        } else {
            System.err.println("That color option is not offered");
            return false;
        }

    }

    public boolean validateType(String type) {
        type = type.toLowerCase();
        if (!type.equals("suv") && !type.equals("sedan")) {
            System.err.println("That type of Car option is not offered");
            return false;
        } else {
            return true;
        }
    }

    public boolean validateMileage(double mileage) {
        double minMileage = 10.0;
        double maxMileage = 50.0;
        if (mileage < minMileage) {
            System.err.println("Mileage must be atleast 10 km/l");
            return false;
        } else if (mileage > maxMileage) {
            System.err.println("Mileage must be reasonable");
            return false;
        } else {
            return true;
        }
    }

    public boolean validateFuelType(String fuelType) {

        fuelType = fuelType.toLowerCase();
        if (!fuelType.equals("petrol") && !fuelType.equals("diesel")) {
            System.err.println("That fuel vehicle is not invented yet!!");
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
                System.err.println("Please enter reasonable year value");
                return false;
            }
        } else {
            System.err.println("Enter valid input");
            return false;
        }
    }

    public boolean validateManufacturerDiscount(double manafacturerDiscount) {
        double minManafacturerDiscount = 0.0;
        double maxManafacturerDiscount = 20.0;
        if (manafacturerDiscount < minManafacturerDiscount) {
            System.err.println("Discount can not be negative");
            return false;
        } else if (manafacturerDiscount > maxManafacturerDiscount) {
            System.err.println("Our AutoShop needs to be profitable, please reconsider!");
            return false;
        } else {
            return true;
        }
    }

    public boolean validateWeight(int weight) {
        if (weight <= 600) {
            System.err.println("Weight must be atleast 6 tons");
            return false;
        } else if (weight > 6000) {
            System.err.println("Weight must be reasonable");
            return false;
        } else {
            return true;
        }
    }

}
