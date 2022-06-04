package workshoptwho;

import workshop.NumberOne;

import java.util.logging.Logger;

/**
 * [
 *   clase NumberNine contiene un logger para imprimir por consola
 *   tiene una constante con una frase la cual la letra a sera cambiada por la letra e
 * ]
 * @author [Yeferson Valencia, alejandro.yand@gmail.com]
 * @since [1,0,0]
 *
 */
public class Electrodomestic {
    protected double baseCost;
    protected String color;
    protected char energyConsumation;
    protected double weight;

    protected final String color1="blanco";
    protected final char energy='F';
    protected final double cost=100;
    protected final double weig=5;

    public double getBaseCost() {
        return baseCost;
    }

    public String getColor() {
        return color;
    }

    public char getEnergyConsumation() {
        return energyConsumation;
    }

    public double getWeight() {
        return weight;
    }

    public Electrodomestic(double baseCost, String color, char energyConsumation, double weight) {
        this.baseCost = baseCost;
        checkColor(color);
        checkEnergyConsumation(energyConsumation);
        this.weight = weight;
    }
    public Electrodomestic(double baseCost, double weight) {
        this.baseCost = baseCost;
        this.weight = weight;
        this.color=color1;
        this.energyConsumation=energy;

    }
    public Electrodomestic() {
        this.baseCost=cost;
        this.color=color1;
        this.energyConsumation=energy;
        this.weight=weig;
    }
    public void checkEnergyConsumation(char character){
            char energyChar[]={'A','B','C','D','E','F'};
            boolean found=false;
        for (char cha:energyChar){
            if(cha==character){
                this.energyConsumation=character;
                found=true;            }
        }
        if (!(found)){
            this.energyConsumation=energy;
        }

    }
    public void checkColor(String color){
        String colors[]={"blanco", "negro", "rojo", "azul", "gris"};
        boolean found=false;
        for (String col:colors){
            if(col.equals(color)){
                this.color=color;
                found=true;
            }
        }
        if (!(found)){
            this.color=color1;
        }
    }
    public double checkBaseCost(){
        double  additional=0.0;
        switch (energyConsumation) {
            case 'A':
                baseCost=100.0;
                break;
            case 'B':
                baseCost=80.0;
                break;
            case 'C':
                baseCost=60.0;
                break;
            case 'D':
                baseCost=50.0;
                break;
            case 'E':
                baseCost=30.0;
                break;
            case 'F':
                baseCost=10.0;
                break;
            default:
        }
        if(weight>=0&&weight<=19){
            additional+=10;
        }else if(weight>=20 && weight<=49){
            additional+=10;
        }else if(weight>=50 && weight<=79){
            additional+=80;
        }else{
            additional+=100;
        }
        return baseCost+additional;
    }
    public void showInfoElectrodomestic() {
        Logger log = Logger.getLogger(NumberOne.class.toString());
        String allMessage="Precio base: "
                + baseCost+"\nColor: "+ color+"\nConsumo de energía:"
                + energyConsumation+"\nPeso kg:"+ weight;
        log.info(allMessage);
    }
}
