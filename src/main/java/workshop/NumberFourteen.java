package workshop;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * [
 *   clase NumberFourteen contiene un logger para imprimir por consola un metodo peromite calcular los numeros
 *   de dos en dos. iniciando desde el numero que ingresa el usuario
 * ]
 * @author [Yeferson Valencia, alejandro.yand@gmail.com]
 * @since [1,0,0]
 *
 */
public class NumberFourteen {
    private  Logger log = Logger.getLogger(NumberFourteen.class.getName());

    /**
     * [
     *  Emtodo rrecibe numero ingresado por el usuario y dentro de un for que se empieza a recorrer
     *  de 2 en 2, se imprimen dichos numero
     * ]
     * @author [Yeferson Valencia, alejandro.yand@gmail.com]
     * @since [1,0,0]
     *
     */
    public void calculateNumber() {
        Scanner in = new Scanner(System.in);
        log.info("ingrerar numero");
        int number=in.nextInt();
        for(int i=number;i<=1000;i+=2){
            String numString= "Number:" + i;
            log.info(numString);
        }
    }
}
