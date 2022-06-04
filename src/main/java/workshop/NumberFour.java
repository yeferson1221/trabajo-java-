package workshop;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * [
 *   clase NumberUne hace referencia al algoritmo numero 2 del taller
 *   contiene 2 atributos de tipo numerico y dos metodos
 * ]
 *
 * 4.	Lee un número por teclado que pida el precio de un producto
 * (puede tener decimales) y calcule el precio final con IVA. El IVA sera
 * una constante que sera del 21%.
 *
 * @version [1,0.0]
 *
 * @author [Yeferson Valencia, alejandro.yand@gmail.com]
 * @since [1,0,0]
 *
 */
public class NumberFour {
    private double number;
    private final double iva=0.21;
    private double calculateProductIva;
    private Logger log = Logger.getLogger(NumberFour.class.getName());

    Scanner in = new Scanner(System.in);
    /**
     * [
     *   El metodo calculateIva permite clalcular el iba
     *   recibe un numero este  se multiplica por la costante iva el resultado se le suma
     *   al rpecio original
     * ]
     * @author [Yeferson Valencia, alejandro.yand@gmail.com]
     */
    public void calculateIva(){
        log.info("Ingresar precio del producto");
        number=in.nextDouble();
        calculateProductIva=(number*iva)+number;
        String allMessenger = "El valor del producto con iba es: "+calculateProductIva;
        log.info(allMessenger);
    }


}

