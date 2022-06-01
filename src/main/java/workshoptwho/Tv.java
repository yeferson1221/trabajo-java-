package workshoptwho;

import workshop.NumberOne;

import java.util.logging.Logger;

public class Tv extends Electrodomestic{
    private double resolution;
    private boolean syncronize;

    private final int resolutionFinal=20;
    private final boolean syncronizeFinal=false;

    public double getResolution() {
        return resolution;
    }

    public void setResolution(double resolution) {
        this.resolution = resolution;
    }

    public boolean isSyncronize() {
        return syncronize;
    }

    public void setSyncronize(boolean syncronize) {
        this.syncronize = syncronize;
    }

    public Tv(double baseCost, String color, char energyConsumation, Double weight, double resolution, boolean syncronize) {
        super(baseCost, color, energyConsumation, weight);
        this.resolution = resolution;
        this.syncronize = syncronize;
    }

    public Tv(double baseCost, double weight) {
        super(baseCost, weight);
        this.resolution = resolutionFinal;
        this.syncronize = syncronizeFinal;
    }
     @Override
     public double checkBaseCost(){
         double additional = super.checkBaseCost();
         if(resolution>40){
             additional+=(additional*0.3);
         }else if(syncronize){
             additional+=50;
         }
         return additional;
     }

    @Override
    public void showInfoElectrodomestic() {
        super.showInfoElectrodomestic();
        Logger log = Logger.getLogger(NumberOne.class.toString());
        String allMessage="Resolucion: "
                + resolution+"\nColor: "+ syncronize;
        log.info(allMessage);
    }

}
