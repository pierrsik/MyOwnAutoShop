//group activity
public abstract class Car implements Vehicle {

    // Data members
    protected int speed;
    protected String name;
    protected double price;
    protected String color;
    protected String type;
    protected double mileage;
    protected String fuelType;
    protected String year;

    abstract public double getSalePrice();

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Getter and Setter for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getter and Setter for color
    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Getter and Setter for type
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Getter and Setter for mileage
    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    // Getter and Setter for fuelType
    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Car(String name, int speed, double price, String color, String type, double mileage, String fuelType,
            String year) {
        // Car.id = Car.id +1;
        this.name = name;
        this.speed = speed;
        this.price = price;
        this.color = color;
        this.type = type;
        this.mileage = mileage;
        this.fuelType = fuelType;
        this.year = year;
    }

}