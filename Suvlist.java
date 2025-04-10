
//houses all the created SUV instances
import java.util.ArrayList;

public class Suvlist {
    private ArrayList<Suv> SuvList = new ArrayList<>();
    private ArrayList<Suv> filteredList = new ArrayList<>();

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
        // Print table header
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------------");
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-5s | %-15s | %-6s | %-10s | %-8s | %-10s | %-5s | %-10s | %-7s | %-10s |\n",
                "ID", "Name", "Speed", "Color", "Mileage", "FuelType", "Year", "Price", "Weight", "SalePrice");
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------------");
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------------");
        // Print each SUV in the list
        for (Suv suv : suvList) {
            System.out.printf("| %-5d | %-15s | %-6d | %-10s | %-8.2f | %-10s | %-5s | %-10.2f | %-7d | %-10.2f |\n",
                    suv.getId(), suv.getName(), suv.getSpeed(), suv.getColor(), suv.getMileage(),
                    suv.getFuelType(), suv.getYear(), suv.getPrice(), suv.getWeight(), suv.getSalePrice());
        }

        // Print table footer
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------------");
        
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
            System.out.println("Invalid index. No Suv removed.");
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
        System.out.println("No Suv found with the name: " + name);
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
