package suv;

//houses all the created SUV instances
import java.util.ArrayList;

public class Suvlist {
    private ArrayList<Suv> SuvList = new ArrayList<>();

    // method to add a Suv object to the list
    public void addSuv(Suv suv) {
        SuvList.add(suv);
    }

    public void displaySuv() {
        for (Suv suv : SuvList) {
            System.out.println(suv.getName());
            System.out.println(suv.getPrice());
            System.out.println(suv.getSalePrice());

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
    public ArrayList<Suv> filterByColor(String color) {
        ArrayList<Suv> filteredList = new ArrayList<>();
        for (Suv suv : SuvList) {
            if (suv.getColor().equalsIgnoreCase(color)) {
                filteredList.add(suv);
            }
        }
        return filteredList;
    }

    // method to filter Suv objects by fuel type
    public ArrayList<Suv> filterByFuelType(String fuelType) {
        ArrayList<Suv> filteredList = new ArrayList<>();
        for (Suv suv : SuvList) {
            if (suv.getFuelType().equalsIgnoreCase(fuelType)) {
                filteredList.add(suv);
            }
        }
        return filteredList;
    }

    // method to filter Suv objects by weight
    public ArrayList<Suv> filterByWeight(int weight) {
        ArrayList<Suv> filteredList = new ArrayList<>();
        for (Suv suv : SuvList) {
            if (suv.getWeight() <= weight) {
                filteredList.add(suv);
            }
        }
        return filteredList;
    }

    // method to filter Suv objects by year
    public ArrayList<Suv> filterByYear(int year) {
        ArrayList<Suv> filteredList = new ArrayList<>();
        for (Suv suv : SuvList) {
            if (Integer.parseInt(suv.getYear()) >= year) {
                filteredList.add(suv);
            }
        }
        return filteredList;
    }

    // method to filter Suv objects by speed
    public ArrayList<Suv> filterBySpeed(int speed) {
        ArrayList<Suv> filteredList = new ArrayList<>();
        for (Suv suv : SuvList) {
            if (suv.getSpeed() <= speed) {
                filteredList.add(suv);
            }
        }
        return filteredList;
    }

    // method to filter Suv objects by mileage
    public ArrayList<Suv> filterByMileage(double mileage) {
        ArrayList<Suv> filteredList = new ArrayList<>();
        for (Suv suv : SuvList) {
            if (suv.getMileage() <= mileage) {
                filteredList.add(suv);
            }
        }
        return filteredList;
    }

    // method to filter Suv objects by name
    public ArrayList<Suv> filterByName(String name) {
        ArrayList<Suv> filteredList = new ArrayList<>();
        String companyName = name.split(" ")[0];
        for (Suv suv : SuvList) {
            if (suv.getName().toLowerCase().contains(companyName.toLowerCase())) {
                filteredList.add(suv);
            }
        }
        return filteredList;
    }

    // method to filter Suv objects by sale price
    public ArrayList<Suv> filterBySalePrice(double salePrice) {
        ArrayList<Suv> filteredList = new ArrayList<>();
        for (Suv suv : SuvList) {
            if (suv.getSalePrice() <= salePrice) {
                filteredList.add(suv);
            }
        }
        return filteredList;
    }

}
