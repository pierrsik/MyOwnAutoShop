//group activity
public interface Car{
    // Data members (implicitly public, static, and final)
    int speed = 0;
    double price = 0.0;
    String color = "";
    String type = "";
    double mileage = 0.0;
    String fuelType = "";

    // Abstract getters 
    int getSpeed();
    double getPrice();
    String getColor();
    String getType();
    double getMileage();
    String getFuelType();

    // abstract setters;
    void setSpeed();
    void setPrice();
    void setColor();
    void setType();
    void setMileage();
    void setFuelType();

    //abstarct getSalePrice() method
    double getSalePrice();
}