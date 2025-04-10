package sedan;

import car.Car;

public class Sedan extends Car {
    private double manafacturerDiscount;
    private int id;
    private static int idCount = 1000;

    public double getManafacturerDiscount() {
        return manafacturerDiscount;
    }

    public int getId() {
        return id;
    }

    public void setManafacturerDiscount(double manafacturerDiscount) {
        this.manafacturerDiscount = manafacturerDiscount;
    }

    public double getSalePrice() {
        double salePrice = this.getPrice() - manafacturerDiscount;
        return salePrice;
    }

    // parameterized constructor
    public Sedan(String name, int speed, double price, String color, double mileage, String fuelType,
            String year, double manafacturerDiscount) {
        super(name, speed, price, color, "Sedan", mileage, fuelType, year);
        this.id = Sedan.idCount + 1;
        this.manafacturerDiscount = manafacturerDiscount;
    }
}