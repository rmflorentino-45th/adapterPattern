package adapterPatterns;

public class ApplianceManager {

    public static void main(String[] args) {

        Laptop usecase1 = new Laptop();
        Refrigerator usecase2 = new Refrigerator();
        Smartphone usecase3 = new Smartphone();
        
        LaptopAdapter translator1 = new LaptopAdapter(usecase1);
        RefridgeratorAdapter translator2 = new RefridgeratorAdapter(usecase2);
        SmartphoneAdapter translator3 = new SmartphoneAdapter(usecase3);

        translator1.plugIn();
        translator2.plugIn();
        translator3.plugIn();

    }
    
}