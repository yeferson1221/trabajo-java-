package workshop;

import java.util.Scanner;
import java.util.logging.Logger;

public class NumberEight {
    public void dayFree(){
        Logger log = Logger.getLogger(NumberEight.class.getName());
        Scanner in = new Scanner(System.in);
        String day = "";
        log.info("Ingresar dia de la semana: ");
        day=in.nextLine();
        switch ( day ) {
            case "lunes":
                log.info( "trabajo el lunes");
                break;
            case "martes":
                log.info("trabajo el martes");
                break;
            case "miercoles":
                log.info("trabajo el miercoles");
                break;
            case "jueves":
                log.info("trabajo el jueves");
                break;
            case "vienes":
                log.info("trabajo el viernes");
                break;
            case "sabado":
                log.info("Dia libre sabado");
                break;
            case "domingo":
                log.info("Dia libre domingo");
                break;
            default:
                log.info("error" );
                break;
        }
    }
}
