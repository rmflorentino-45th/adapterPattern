package adapterPatterns;

public class ApplianceManager {

    public static void main(String[] args) {

        Laptop usecase1 = new Laptop();
        Smartphone usecase2 = new Smartphone();

        LaptopAdapter translator1 = new LaptopAdapter(usecase1);
        SmartphoneAdapter translator2 = new SmartphoneAdapter(usecase2);

        translator1.plugIn();
        translator2.plugIn();

    }
    
}