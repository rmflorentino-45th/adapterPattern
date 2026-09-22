package adapterPatterns;

public class RefridgeratorAdapter implements PowerOutlet {
    private Refrigerator bosch;

    public RefridgeratorAdapter(Refrigerator bosch){
        this.bosch = bosch;
    }

    @Override
    public void plugIn() {
        bosch.startCooling();
    }
}