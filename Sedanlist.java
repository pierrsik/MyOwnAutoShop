
//houses all the created Sedan instances
import java.util.ArrayList;

public class Sedanlist {
    private ArrayList<Sedan> SedanList = new ArrayList<>();
    private ArrayList<Sedan> filteredData = new ArrayList<>();

    public Sedanlist() {
        // Constructor
        Sedan sedan1 = new Sedan("Toyota Camry",220,480000,"blue",26,"petrol","2020",15000);
        SedanList.add(sedan1);
        Sedan sedan2 = new Sedan("honda city amaze",180,450000,"red",20,"diesel","2021",20000);
        SedanList.add(sedan2);
        Sedan sedan3 = new Sedan("Hyundai Verna",200,600000,"black",22,"petrol","2022",12000);
        SedanList.add(sedan3);
        Sedan sedan4 = new Sedan("Skoda Octavia",240,600000,"white",18,"diesel","2023",25000);
        SedanList.add(sedan4);
        Sedan sedan5 = new Sedan("Nissan Altima",210,1000000,"grey",24,"petrol","2024",30000);
        SedanList.add(sedan5);
        Sedan sedan6 = new Sedan("Kia K5",230,700000,"blue",28,"diesel","2025",35000);
        SedanList.add(sedan6);
        Sedan sedan7 = new Sedan("Mazda 6",220,700000,"red",25,"petrol","2021",40000);
        SedanList.add(sedan7);
        Sedan sedan8 = new Sedan("Subaru Legacy",200,650000,"black",23,"diesel","2020",45000);
        SedanList.add(sedan8);
        Sedan sedan9 = new Sedan("TATA Yaris",180,550000,"white",21,"petrol","2024",50000);
        SedanList.add(sedan9);
        
        Sedan sedan10 = new Sedan("Chevrolet Malibu",210,5400000,"grey",29,"diesel","2019",55000);
        SedanList.add(sedan10);
        Sedan sedan11 = new Sedan("Ford Fusion",220,5700000,"blue",30,"petrol","2021",60000);
        SedanList.add(sedan11);
        Sedan sedan12 = new Sedan("Chrysler 300",240,6000000,"red",31,"diesel","2019",65000);
        SedanList.add(sedan12);
        Sedan sedan13 = new Sedan("Mahindra XUV300",200,100000,"black",32,"petrol","2018",70000);
        SedanList.add(sedan13);
        Sedan sedan14 = new Sedan("TATA Tiago",180,500000,"white",33,"diesel","2022",75000); 
        SedanList.add(sedan14);
        Sedan sedan15 = new Sedan("Maruti Suzuki Dzire",210,550000,"grey",34,"petrol","2022",80000);    
        SedanList.add(sedan15);
        Sedan sedan16 = new Sedan("Honda Accord",220,600000,"blue",35,"diesel","2023",85000);
        SedanList.add(sedan16);
        Sedan sedan17 = new Sedan("Toyota Corolla",240,650000,"red",36,"petrol","2018",90000);  
        SedanList.add(sedan17);
        Sedan sedan18 = new Sedan("Nissan Sentra",200,700000,"black",37,"diesel","2019",95000); 
        SedanList.add(sedan18);
        Sedan sedan19 = new Sedan("Skoda Superb",180,750000,"white",38,"petrol","2020",40000); 
        SedanList.add(sedan19);
        Sedan sedan20 = new Sedan("Hundai Aura",210,650000,"red",39,"diesel","2021",100000);
        SedanList.add(sedan20);
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
            System.out.println("No Sedans available.");
            return;
        }
        // Print table header
        String border = "-".repeat(150);
        System.out.println(border);
        System.out.println(border);
            
        System.out.printf("| %-6s | %-20s | %-6s | %-10s | %-8s | %-10s | %-6s | %-12s | %-20s | %-12s |\n",
                "ID", "Name", "Speed", "Color", "Mileage", "FuelType", "Year", "Price", "Manufacturer Discount",
                "SalesPrice");
        System.out.println(border);
        System.out.println(border);
            
        // Print each Sedan in the list
        for (Sedan sedan : sedanList) {
            System.out.printf("| %-6d | %20s | %-6d | %-10s | %-8.2f | %-10s | %-6s | %-12.2f | %-20.2f | %-12.2f |\n",
                    sedan.getId(), sedan.getName(), sedan.getSpeed(), sedan.getColor(), sedan.getMileage(),
                    sedan.getFuelType(), sedan.getYear(), sedan.getPrice(),
                    sedan.getManufacturerDiscount(), sedan.getSalePrice());
        }

        // Print table footer
        System.out.println(border);
        /*
         * for (Sedan sedan : SedanList) {
         * System.out.println(sedan.getName());
         * System.out.println(sedan.getPrice());
         * System.out.println(sedan.getSalePrice());
         * }
         */
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
