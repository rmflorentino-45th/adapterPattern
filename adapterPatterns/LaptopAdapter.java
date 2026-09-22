package adapterPatterns;

public class LaptopAdapter implements PowerOutlet {
    private Laptop macbook;

    public LaptopAdapter(Laptop macbook){
        this.macbook = macbook;
    }

    @Override
    public void plugIn() {
        macbook.charge();
    }
}