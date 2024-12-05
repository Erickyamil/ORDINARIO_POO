package lab_lis_ordinario;

public class Laptop extends Computer implements PortableDevice{
    protected int batteryCapacity;
    protected double weight;

    public Laptop(String model, String manufacturer, String operatingSystem, int batteryCapacity, double weight){
        super(model, manufacturer, operatingSystem);
        this.batteryCapacity = batteryCapacity;
        this.weight = weight;
    }

    public String getComputerType(){
        return "Computadora portátil";
    }

    public int calculatePortabilityScore(){
        return (int) (weight);
    }

    public String getModel(){
        return model;
    }

    public int getBatteryCapacity(){
        return batteryCapacity;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
