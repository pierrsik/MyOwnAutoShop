public class Sedan extends Car {
    private double manufacturerDiscount;
    private int id;
    private static int idCount = 1000;

    public double getManufacturerDiscount() {
        return manufacturerDiscount;
    }

    public int getId() {
        return id;
    }

    public void setManufacturerDiscount(double manafacturerDiscount) {
        this.manufacturerDiscount = manafacturerDiscount;
    }

    public double getSalePrice() {
        double salePrice = this.getPrice() - (this.getPrice() * (manufacturerDiscount / 100));
        return salePrice;
    }

    // parameterized constructor
    public Sedan(String name, int speed, double price, String color, double mileage, String fuelType,
            String year, double manafacturerDiscount) {
        super(name, speed, price, color, "Sedan", mileage, fuelType, year);
        this.id = ++Sedan.idCount;
        this.manufacturerDiscount = manafacturerDiscount;
    }
}