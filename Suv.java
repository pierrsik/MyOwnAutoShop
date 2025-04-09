public class Suv extends Car {
    private int weight;
    private static int id = 1000;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    // parameterized constructor
    public Suv(String name, int speed, double price, String color, double mileage, String fuelType,
            String year,
            int weight) {
        super(name, speed, price, color, "Suv", mileage, fuelType, year);
        Suv.id = Suv.id + 1;
        this.weight = weight;
    }

    public double getSalePrice() {
        if (weight > 2000) {
            return getPrice() * 0.9; // 10% discount for heavy SUVs
        } else {
            return getPrice() * 0.8; // 20% discount for light SUVs
        }
    }

}