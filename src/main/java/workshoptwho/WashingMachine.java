package workshoptwho;

import java.util.logging.Logger;

public class WashingMachine extends Electrodomestic{
    private Double burden;
    private final double burderFinal=5;

    public Double getBurden() {
        return burden;
    }

    public WashingMachine(double baseCost, String color, char energyConsumation, double weight, double burden) {
        super(baseCost, color, energyConsumation, weight);
        this.burden = burden;

    }

    public WashingMachine(double baseCost, double weight) {
        super(baseCost, weight);
        this.burden=burderFinal;
    }

    @Override
    public double checkBaseCost(){
        double additional=super.checkBaseCost();
        if(burden>30){
            additional+=50;
        }
        return additional;
    }

    @Override
    public void showInfoElectrodomestic() {
        super.showInfoElectrodomestic();
        Logger log = Logger.getLogger(WashingMachine.class.toString());
        String allMessage="Carga: "+burden;
        log.info(allMessage);
    }
}
