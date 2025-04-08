public class Suv extends Car{
    private int weight;
    
    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight=weight;
    }

    //parameterized constructor
    public Suv(int speed,double price ,String color ,String type,double mileage,String fuelType,String year, int weight){
        super(speed,price,color,type,mileage,fuelType,year);
        this.weight=weight;
    }

}