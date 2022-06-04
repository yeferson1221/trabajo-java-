package workshop;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * [
 *  la clase NumberEight Ingresa un dia de la semana y el sistema con un switch case
 *  nos permite saber que dia el libre y cual no;
 * ]
 * @author [Yeferson Valencia, alejandro.yand@gmail.com]
 */
public class NumberEight {
    /**
     * [
     *  El dayfree s Ingresa un dia de la semana con un logger por consola
     *  luego con ul switch nos permite validar el lo que ingresa el usuario
     *  con los casos que esten disponibles en el sistema
     * ]
     * @author [Yeferson Valencia, alejandro.yand@gmail.com]
     */
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
