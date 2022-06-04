package workshop;

import java.util.Scanner;
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
public class NumberTen {
    private Logger log = Logger.getLogger(NumberTen.class.getName());
    Scanner in  = new Scanner(System.in);
    private String textString;


    public void showText() {
        log.info("Ingresar Frase");
        textString=in.nextLine();
        String finalText = textString.replace(" ", "");
        String allMessenger = "Old String: "+textString+"Texto Nuevo: "+finalText;
        log.info(allMessenger);
    }
}
