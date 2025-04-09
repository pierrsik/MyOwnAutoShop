public class Sedan extends Car {
    private double manafacturerDiscount;
    private static int id = 1000;

    public double getManafacturerDiscount() {
        return manafacturerDiscount;
    }

    public void setManafacturerDiscount(double manafacturerDiscount) {
        this.manafacturerDiscount = manafacturerDiscount;
    }

    public double getSalePrice() {
        double salePrice = getPrice() - manafacturerDiscount;
        return salePrice;
    }

    // parameterized constructor
    public Sedan(String name, int speed, double price, String color, double mileage, String fuelType,
            String year, double manafacturerDiscount) {
        super(name, speed, price, color, "Sedan", mileage, fuelType, year);
        Sedan.id = Sedan.id + 1;
        this.manafacturerDiscount = manafacturerDiscount;
    }
}