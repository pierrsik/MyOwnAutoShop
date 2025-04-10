
//houses all the created Sedan instances
import java.util.ArrayList;

public class Sedanlist {
    private ArrayList<Sedan> SedanList = new ArrayList<>();
    private ArrayList<Sedan> filteredData = new ArrayList<>();

    public Sedanlist() {
        // Constructor
        // Sedan sedan1 = new Sedan("Toyota Camry", 30000, 25000, "Red", "diesel", "2020", 150.0);
        // SedanList.add(sedan1);
        // Sedan sedan2 = new Sedan("Honda Accord", 28000, 24000, "Blue", "petrol", "2021", 140.0);
    }
    // method to add a Sedan object to the list
    public void addSedan(Sedan sedan) {
        SedanList.add(sedan);
    }

    public ArrayList<Sedan> getFilteredData() {
        return filteredData;
    }

    // method to get the list of Sedan objects
    public ArrayList<Sedan> getSedanList() {
        return SedanList;
    }

    // display the Sedan
    public void displaySedan(ArrayList<Sedan> sedanList) {
        if (sedanList == null || sedanList.isEmpty()) {
            System.out.println("**No Sedans available.");
            return;
        }
        for (Sedan sedan : SedanList) {
            System.out.println(sedan.getName());
            System.out.println(sedan.getPrice());
            System.out.println(sedan.getSalePrice());
        }
    }

    // method to set the list of Sedan objects
    public void setSedanList(ArrayList<Sedan> sedanList) {
        this.SedanList = sedanList;
    }

    // method to get the number of Sedan objects in the list
    public int getNumberOfSedans() {
        return SedanList.size();
    }

    // method to get a Sedan object by index
    public Sedan getSedan(int index) {
        if (index >= 0 && index < SedanList.size()) {
            return SedanList.get(index);
        } else {
            return null;
        }
    }

    // method to remove a Sedan object from the list by index
    public void removeSedan(int index) {
        if (index >= 0 && index < SedanList.size()) {
            SedanList.remove(index);
        } else {
            System.out.println("**Invalid index. No Sedan removed.");
        }
    }

    // method to remove a Sedan object from the list by name
    public void removeSedanByName(String name) {
        for (int i = 0; i < SedanList.size(); i++) {
            if (SedanList.get(i).getName().equalsIgnoreCase(name)) {
                SedanList.remove(i);
                return;
            }
        }
        System.out.println("**No Sedan found with the name: " + name);
    }

    // method to filter Sedan objects by color
    public void filterByColor(String color) {
        ArrayList<Sedan> filteredList = new ArrayList<>();
        for (Sedan sedan : SedanList) {
            if (sedan.getColor().equalsIgnoreCase(color)) {
                filteredList.add(sedan);
            }
        }
        filteredData = filteredList;
    }

    // method to filter Sedan objects by fuel type
    public void filterByFuelType(String fuelType) {
        ArrayList<Sedan> filteredList = new ArrayList<>();
        for (Sedan sedan : SedanList) {
            if (sedan.getFuelType().equalsIgnoreCase(fuelType)) {
                filteredList.add(sedan);
            }
        }
        filteredData = filteredList;
    }

    // method to filter Sedan objects by year
    public void filterByYear(String year) {
        ArrayList<Sedan> filteredList = new ArrayList<>();
        for (Sedan sedan : SedanList) {
            if (sedan.getYear().equalsIgnoreCase(year)) {
                filteredList.add(sedan);
            }
        }
        filteredData = filteredList;
    }

    // method to filter Sedan objects by speed
    public void filterBySpeed(double speed) {
        ArrayList<Sedan> filteredList = new ArrayList<>();
        for (Sedan sedan : SedanList) {
            if (sedan.getSpeed() <= speed) {
                filteredList.add(sedan);
            }
        }
        filteredData = filteredList;
    }

    // method to filter Sedan objects by name
    public void filterByName(String name) {
        ArrayList<Sedan> filteredList = new ArrayList<>();
        for (Sedan sedan : SedanList) {
            if (sedan.getName().toLowerCase().contains(name.toLowerCase())) {
                filteredList.add(sedan);
            }
        }
        filteredData = filteredList;
    }

    // method to filter Sedan objects by sale price
    public void filterBySalePrice(double salePrice) {
        ArrayList<Sedan> filteredList = new ArrayList<>();
        for (Sedan sedan : SedanList) {
            if (sedan.getSalePrice() <= salePrice) {
                filteredList.add(sedan);
            }
        }
        filteredData = filteredList;
    }

}
