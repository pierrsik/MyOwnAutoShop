public class Sedan extends Car {
    private double manafacturerDiscount;
    private static int id = 1000;

    public double getManafacturerDiscount() {
        return manafacturerDiscount;
    }

    public void setManafacturerDiscount(double manafacturerDiscount) {
        this.manafacturerDiscount = manafacturerDiscount;
    }

    // Complete this method
    public double getSalePrice() {
        return 1;
    }

    // parameterized constructor
    public Sedan(String name, int speed, double price, String color, String type, double mileage, String fuelType,
            String year, double manafacturerDiscount) {
        super(name, speed, price, color, type, mileage, fuelType, year);
        Sedan.id = Sedan.id + 1;
        this.manafacturerDiscount = manafacturerDiscount;
    }
}