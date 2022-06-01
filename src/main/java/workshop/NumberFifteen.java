package workshop;

import java.util.Scanner;
import java.util.logging.Logger;

public class NumberFifteen {
    private int number1=1;
    private Logger log = Logger.getLogger(NumberFifteen.class.getName());
    public void showMenu(){
        Scanner in = new Scanner(System.in);
        while (number1<=7 ||number1>8){
            log.info("1-NUEVO ACTOR\n" +
                    "2-BUSCAR ACTOR\n" +
                    "3-ELIMINAR ACTOR\n" +
                    "4-MODIFICAR ACTOR\n" +
                    "5-VER TODOS LOS ACTORES\n" +
                    "6- VER PELICULAS DE LOS ACTORES\n" +
                    "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                    "8-SALIR\n");
            number1=in.nextInt();
            if(number1>8 || number1==0){
                log.info("[Error Opcion incorrecta]");
            }
        }
    }

}
