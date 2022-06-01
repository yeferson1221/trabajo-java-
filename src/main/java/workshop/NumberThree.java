package workshop;
import java.util.logging.Logger;
import java.util.Scanner;

/**
 * [
 *   clase NumberUne hace referencia al algoritmo numero 2 del taller
 *   contiene 2 atributos de tipo numerico y dos metodos
 * ]
 * @version [1,0.0]
 *
 * @author [Yeferson Valencia, alejandro.yand@gmail.com]
 * @since [1,0,0]
 *
 */
public class NumberThree {
    private String radio;

    /**
     * [
     * el metodo circle() nos pide ingresar un string
     * luego este se trasforma en un double para con la
     * ayuda de la clase Math hacemos la operacion de
     * calcular el area
     * ]
     *
     * @version [1, 0.0]
     * @author [Yeferson Valencia, alejandro.yand@gmail.com]
     * @since [1, 0, 0]
     */
    public void circle() {
        Logger log = Logger.getLogger(NumberThree.class.getName());
        Scanner in = new Scanner(System.in);
        log.info("Ingresar el radio del Circulo");
        radio = in.nextLine();
        double radioDouble = Double.parseDouble(radio);

        log.info("El área del Circulo es: ");
         Double result = Math.PI * (Math.pow(radioDouble, 2));// se guarda en una variable double en caso de solicitarlo
         String result1 = String.valueOf(result); //
         log.info(result1);
    }


}
