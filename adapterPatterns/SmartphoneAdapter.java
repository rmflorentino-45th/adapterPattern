package adapterPatterns;

public class SmartphoneAdapter implements PowerOutlet {
    private Smartphone nokia;

    public SmartphoneAdapter(Smartphone nokia){
        this.nokia = nokia;
    }

    @Override 
    public void plugIn() {
        nokia.chargePhone();
    }
}
