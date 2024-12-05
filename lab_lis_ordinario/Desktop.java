package lab_lis_ordinario;

public class Desktop extends Computer{
    protected double caseHeight;

    public Desktop(String model, String manufacturer, String operatingSystem, double caseHeight){
        super(model, manufacturer, operatingSystem);
        this.caseHeight = caseHeight;
    }

    public String getComputerType(){
        return "Computadora de escritorio";
    }

    public int calculatePortabilityScore(){
        return (int) (5 + (caseHeight/20));
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
