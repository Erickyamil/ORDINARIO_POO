package lab_lis_ordinario;

public final class Notebook extends Laptop{
    public Notebook(String model, String manufacturer, String operatingSystem, int batteryCapacity, double weight){
        super(model, manufacturer, operatingSystem, batteryCapacity, weight);
    }

    public final String getComputerType(){
        return "Computadora-laptop: NOTEBOOK";
    }

    public final int calculatePortabilityScore(){
        return 1;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
