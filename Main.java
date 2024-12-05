import lab_lis_ordinario.*; 

public class Main {
    public static void main(String[] args) throws Exception {
        Computer[] computadoras = new Computer[3];
        computadoras[0] = new Desktop("2020", "IBM   ", "Linux ", 12);
        computadoras[1] = new Laptop("2024", "HP    ", "Win   ", 4600, 5);
        computadoras[2] = new Notebook("2022", "Apple ", "MacOS ", 3900, 4);

        System.out.println("No.  Model  Marca   SO      Tipo");

        for(int i = 0; i < computadoras.length; i++){
            System.out.println(i + "    " + computadoras[i].getModel() + "   " + computadoras[i].getManufacturer() + 
                                "  " + computadoras[i].getOperatingSystem() + "  " + computadoras[i].getComputerType());
        }
    }
}
