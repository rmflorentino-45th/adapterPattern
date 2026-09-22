package adapterPatterns;

public class ApplianceManager {

    public static void main(String[] args) {

        Laptop usecase1 = new Laptop();

        LaptopAdapter translator1 = new LaptopAdapter(usecase1);

        translator1.plugIn();

    }
    
}