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

}

