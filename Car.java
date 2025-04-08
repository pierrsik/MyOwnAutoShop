//group activity
public class Car implements Vehicle{
    // Data members
    protected static int id =1000;

    protected int speed;
    protected double price ;
    protected String color ;
    protected String type;
    protected double mileage;
    protected String fuelType;
    protected String year;
    public double getSalePrice(){
        return 1;
    }

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

    public Car(int speed,double price ,String color ,String type,double mileage,String fuelType,String year){
        Car.id = Car.id +1;
        this.speed = speed;
        this.price = price;
        this.color = color;
        this.type= type;
        this.mileage = mileage;
        this.fuelType = fuelType;
        this.year = year;
    }

}