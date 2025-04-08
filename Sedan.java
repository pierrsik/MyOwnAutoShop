public class Sedan extends Car{
    private double manafacturerDiscount;

    public double getManafacturerDiscount(){
        return manafacturerDiscount;
    }

    public void setManafacturerDiscount(double manafacturerDiscount){
        this.manafacturerDiscount = manafacturerDiscount;
    }
    // parameterized constructor
    public Sedan(int speed,double price ,String color ,String type,double mileage,String fuelType,String year, double manafacturerDiscount){
        super(speed,price,color,type,mileage,fuelType,year);
        this.manafacturerDiscount=manafacturerDiscount;
    }
}