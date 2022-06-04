package workshop;

import java.util.Scanner;
import java.util.logging.Logger;
/**
 * [
 *  La clase NumberFifteen contiene un  logger private para ingresar por consola
 *  un atributo number
 *  un metodo showMenu
 * ]
 * @author [Yeferson Valencia, alejandro.yand@gmail.com]
 */

public class NumberFifteen {
    private int number1=1;
    private Logger log = Logger.getLogger(NumberFifteen.class.getName());

    /**
     * [
     *  El metodo showMenu muestra un menu con opciones del 1 aL 8  DONDE con un while
     *  que se ejcuta hasta que no se cumpla  la condicion number1 sea menor o igual a 7  y number1
     *  sema mayor o 8 
     * ]
     * @author [Yeferson Valencia, alejandro.yand@gmail.com]
     */
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
