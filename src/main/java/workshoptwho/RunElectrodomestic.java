package workshoptwho;

import workshop.NumberOne;

import java.util.logging.Logger;

public class RunElectrodomestic {
    public static void main(String[] args) {
        Logger log = Logger.getLogger(NumberOne.class.toString());
        log.info("Ejercicio 17: Electrodomésticos");
        Electrodomestic[] listElectro =new Electrodomestic[10];

        listElectro[0]=new Electrodomestic(300.0, "Verde",'C',80.0);
        listElectro[1]=new WashingMachine(250.0, 40.0);
        listElectro[2]=new Tv(450.0, "negro",'E',90.0, 10.0, true);
        listElectro[3]=new Electrodomestic();
        listElectro[4]=new Electrodomestic(700.0, "gris", 'D', 20.0);
        listElectro[5]=new WashingMachine(200.0, "blanco", 'Z', 40.0 ,40.0);
        listElectro[6]=new Tv(350.0, 60.0);
        listElectro[7]=new WashingMachine(600.0,"azul", 'A', 200.0, 25.0);
        listElectro[8]=new Tv(200.0,"naranja", 'C', 70.0, 30.0, false);
        listElectro[9]=new Electrodomestic(60.0, 20.0);


        showInfo(listElectro);
        costFinal(listElectro);
    }

    public static void costFinal(Electrodomestic[] list){
        Logger log = Logger.getLogger(NumberOne.class.toString());
        double pElec=0;
        double pLav=0;
        double pTel=0;
        double resB;

        for (int y=0; y<list.length;y++){
            resB=list[y].checkBaseCost();
            if (list[y] instanceof WashingMachine){
                pLav+=resB;
            }else if (list[y] instanceof Tv){
                pTel+=resB;

            }else{
                pElec+=resB;


            }
        }
        double total=pElec+pLav+pTel;
       log.info("------------------------------------------");
       String allMessage = "Total de electrodomesticos:"+pElec+"\n" +
               "Total de lavadoras: "+pLav+"\n" +
               "Total de televisores: "+pTel+"\nTotal: "+total;
       log.info(allMessage);

    }
    public static void showInfo(Electrodomestic[] list){
        Logger log = Logger.getLogger(NumberOne.class.toString());
        log.info("Listado de electrodomésticos");
        log.info("------------------------------------------");
        for (int x=0; x<list.length;x++){
            if (list[x] instanceof WashingMachine){
                log.info("[Lavadora]");
            }else if (list[x] instanceof Tv){
                log.info("[Televisión]");
            }else{
                log.info("[Electrodomestico]");
            }
            list[x].showInfoElectrodomestic();

        }
    }
}
