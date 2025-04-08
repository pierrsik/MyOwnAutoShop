import java.util.ArrayList;
import java.util.Arrays;

public class Validation {

    private static ArrayList<String> colorList = new ArrayList<>(Arrays.asList("red", "blue", "green"));

    public boolean validateSpeed(int speed){
        try{
            if(speed<0){
                System.out.println("Speed cant be negative");
                return false;
            }
            else if(speed>250){
                System.out.println("Speed must be less than 250");
                return false;
            }
            else {
                return true;
            }
        }
        catch(Exception e){
            System.out.println("Check your input for invalid values");
            return false;
        }
    }


    public boolean validatePrice(double price){
        double minPrice=0.0;
        double maxPrice=1000000.0;
        try{
            if(price<minPrice){
                System.out.println("Price must not be negative");
                return false;
            }
            else if(price>maxPrice){
                System.out.println("Price must be reasonable");
                return false;
            }
            else {
                return true;
            }
        }
        catch(Exception e){
            System.out.println("Check your input for invalid values");
            return false;
        }
    }

    public boolean validateColor(String color){
        color = color.toLowerCase();
        if(colorList.contains(color)){
            return true;
        }
        else{
            System.out.println("That color option is not offerred");
            return false;
        }
    }

    public boolean validateType(String type){
        type = type.toLowerCase();
        if(!type.equals("suv")  && !type.equals("sedan")){
            System.out.println("That color option is not offerred");
            return true;
        }
        else{
            return false;
        }
    }

    public boolean validateMileage(double mileage){
        double minMileage=0.0;
        double maxMileage=30.0;
        try{
            if(mileage<minMileage){
                System.out.println("Mileage must not be negative");
                return false;
            }
            else if(mileage>maxMileage){
                System.out.println("Mileage must be reasonable");
                return false;
            }
            else {
                return true;
            }
        }
        catch(Exception e){
            System.out.println("Check your input for invalid values");
            return false;
        }
    }
    
    public boolean validateFuelType(String fuelType){
        fuelType = fuelType.toLowerCase();
        if(!fuelType.equals("petrol")  && !fuelType.equals("diesel")){
            System.out.println("That fuel vehicle is not invented yet!!");
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean validateYear(String year) {
        // Check if the year is a 4-digit number
        try{
            if (year.matches("\\d{4}")) {
                int yearInt = Integer.parseInt(year);
                // Check if the year is within a reasonable range (e.g., 1000 to 9999)
                if(yearInt >= 1950 && yearInt <= 2400) return true;
                else{
                    System.out.println("Please enter reasonable year value");
                    return false;
                }
            }
            else{
                System.out.println("Enter valid input");
                return false;
            }
        }
        catch(Exception e){
            System.out.println("Enter numeric value for year");
            return false;
        }
    }
    
    public boolean validateManafacturerDiscount(double manafacturerDiscount){
        double minManafacturerDiscount=0.0;
        double maxManafacturerDiscount=20.0;
        try{
            if(manafacturerDiscount<minManafacturerDiscount){
                System.out.println("Mileage must not be negative");
                return false;
            }
            else if(manafacturerDiscount>maxManafacturerDiscount){
                System.out.println("Our AutoShop needs to be profitable, please reconsider!");
                return false;
            }
            else {
                return true;
            }
        }
        catch(Exception e){
            System.out.println("Check your input for invalid values");
            return false;
        }
    }


}

