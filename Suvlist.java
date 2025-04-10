

//houses all the created SUV instances
import java.util.ArrayList;

public class Suvlist {
    private ArrayList<Suv> SuvList = new ArrayList<>();
    private ArrayList<Suv> filteredList = new ArrayList<>();

    // default constructor
    public Suvlist() {
        // empty constructor
        Suv suv1 = new Suv("Toyota RAV4", 220, 3500000, "Red", 25.0, "petrol", "2023", 1500);
        SuvList.add(suv1);
        Suv suv2 = new Suv("Honda CR-V", 200, 2200000, "Blue", 22.0, "diesel", "2022", 1600); 
        SuvList.add(suv2);
        Suv suv3 = new Suv("Ford Explorer", 240, 1200000, "Black", 20.0, "petrol", "2021", 1700);   
        SuvList.add(suv3);
        Suv suv4 = new Suv("Chevrolet Tahoe", 230, 2800000, "White", 18.0, "diesel", "2020", 1800); 
        SuvList.add(suv4);
        Suv suv5 = new Suv("Nissan Rogue", 210, 3200000, "Grey", 24.0, "petrol", "2019", 1400); 
        SuvList.add(suv5);
        Suv suv6 = new Suv("Hyundai Tucson", 220, 3000000, "Red", 26.0, "diesel", "2023", 1500);    
        SuvList.add(suv6);
        Suv suv7 = new Suv("Kia Sportage", 200, 2900000, "Blue", 23.0, "petrol", "2022", 1600); 
        SuvList.add(suv7);
        Suv suv8 = new Suv("Subaru Forester", 240, 3600000, "Black", 21.0, "diesel", "2021", 1700);
        SuvList.add(suv8);
        Suv suv9 = new Suv("Mazda CX-5", 230, 2000000, "White", 19.0, "petrol", "2020", 1800);  
        SuvList.add(suv9);
        Suv suv10 = new Suv("Volkswagen Tiguan", 210, 1100000, "Grey", 27.0, "diesel", "2019", 1400);
        SuvList.add(suv10);
        Suv suv11 = new Suv("Jeep Grand Cherokee", 220, 3000000, "Red", 28.0, "petrol", "2023", 1500);  
        SuvList.add(suv11);
        Suv suv12 = new Suv("Dodge Durango", 200, 3300000, "Blue", 25.0, "diesel", "2022", 1600);   
        SuvList.add(suv12);
        Suv suv13 = new Suv("Toyota Highlander", 240, 2300000, "Black", 24.0, "petrol", "2021", 1700);  
        SuvList.add(suv13);
        Suv suv14 = new Suv("Honda Pilot", 230, 2300000, "White", 22.0, "diesel", "2020", 1800);    
        SuvList.add(suv14);
        Suv suv15 = new Suv("Ford Escape", 210, 2000000, "Grey", 26.0, "petrol", "2019", 1400);
        SuvList.add(suv15);
        Suv suv16 = new Suv("TATA Harrier", 220, 1600000, "Red", 25.0, "diesel", "2023", 1500); 
        SuvList.add(suv16);
        Suv suv17 = new Suv("Mahindra XUV700", 200, 2000000, "Blue", 22.0, "petrol", "2022", 1600); 
        SuvList.add(suv17);
        Suv suv18 = new Suv("Kia Seltos", 240, 1200000, "Black", 20.0, "diesel", "2021", 1700); 
        SuvList.add(suv18);
        Suv suv19 = new Suv("Hyundai Creta", 230, 1000000, "White", 18.0, "petrol", "2020", 1800);  
        SuvList.add(suv19);
        Suv suv20 = new Suv("TATA Nexon", 210, 800000, "Grey", 24.0, "diesel", "2019", 1400); 
        SuvList.add(suv20);
    }

    // method to add a Suv object to the list
    public void addSuv(Suv suv) {
        SuvList.add(suv);
    }

    public ArrayList<Suv> getFilteredData() {
        return filteredList;
    }

    public void displaySUV(ArrayList<Suv> suvList) {
        if (suvList == null || suvList.isEmpty()) {
            System.out.println("No SUV found.");
            return;
        }
        for (Suv suv : suvList) {
            System.out.println("============================");
            System.out.println(suv.getName());
            System.out.println(suv.getPrice());
            System.out.println(suv.getSalePrice());
            System.out.println("============================");

        }
    }

    // method to get the list of Suv objects
    public ArrayList<Suv> getSuvList() {
        return SuvList;
    }

    // method to set the list of Suv objects
    public void setSuvList(ArrayList<Suv> suvList) {
        this.SuvList = suvList;
    }

    // method to get the number of Suv objects in the list
    public int getNumberOfSuvs() {
        return SuvList.size();
    }

    // method to get a Suv object by index
    public Suv getSuv(int index) {
        if (index >= 0 && index < SuvList.size()) {
            return SuvList.get(index);
        } else {
            return null;
        }
    }

    // method to remove a Suv object from the list by index
    public void removeSuv(int index) {
        if (index >= 0 && index < SuvList.size()) {
            SuvList.remove(index);
        } else {
            System.out.println("**Invalid index. No Suv removed.");
        }
    }

    // method to remove a Suv object from the list by name
    public void removeSuvByName(String name) {
        for (int i = 0; i < SuvList.size(); i++) {
            if (SuvList.get(i).getName().equalsIgnoreCase(name)) {
                SuvList.remove(i);
                return;
            }
        }
        System.out.println("**No Suv found with the name: " + name);
    }

    // method to filter Suv objects by color
    public void filterByColor(String color) {
        ArrayList<Suv> filteredList = new ArrayList<>();
        for (Suv suv : SuvList) {
            if (suv.getColor().equalsIgnoreCase(color)) {
                filteredList.add(suv);
            }
        }
        this.filteredList = filteredList;
    }

    // method to filter Suv objects by fuel type
    public void filterByFuelType(String fuelType) {
        ArrayList<Suv> filteredList = new ArrayList<>();
        for (Suv suv : SuvList) {
            if (suv.getFuelType().equalsIgnoreCase(fuelType)) {
                filteredList.add(suv);
            }
        }
        this.filteredList = filteredList;
    }

    // method to filter Suv objects by weight
    public void filterByWeight(int weight) {
        ArrayList<Suv> filteredList = new ArrayList<>();
        for (Suv suv : SuvList) {
            if (suv.getWeight() <= weight) {
                filteredList.add(suv);
            }
        }
        this.filteredList = filteredList;
    }

    // method to filter Suv objects by year
    public void filterByYear(String year) {
        ArrayList<Suv> filteredList = new ArrayList<>();
        for (Suv suv : SuvList) {
            if (suv.getYear().equalsIgnoreCase(year)) {
                filteredList.add(suv);
            }
        }
        this.filteredList = filteredList;
    }

    // method to filter Suv objects by speed
    public void filterBySpeed(double speed) {
        ArrayList<Suv> filteredList = new ArrayList<>();
        for (Suv suv : SuvList) {
            if (suv.getSpeed() <= speed) {
                filteredList.add(suv);
            }
        }
        this.filteredList = filteredList;
    }

    // method to filter Suv objects by mileage
    public void filterByMileage(double mileage) {
        ArrayList<Suv> filteredList = new ArrayList<>();
        for (Suv suv : SuvList) {
            if (suv.getMileage() <= mileage) {
                filteredList.add(suv);
            }
        }
        this.filteredList = filteredList;
    }

    // method to filter Suv objects by name
    public void filterByName(String name) {
        ArrayList<Suv> filteredList = new ArrayList<>();
        for (Suv suv : SuvList) {
            if (suv.getName().toLowerCase().contains(name.toLowerCase())) {
                filteredList.add(suv);
            }
        }
        this.filteredList = filteredList;
    }

    // method to filter Suv objects by sale price
    public void filterBySalePrice(double salePrice) {
        ArrayList<Suv> filteredList = new ArrayList<>();
        for (Suv suv : SuvList) {
            if (suv.getSalePrice() <= salePrice) {
                filteredList.add(suv);
            }
        }
        this.filteredList = filteredList;
    }

}
