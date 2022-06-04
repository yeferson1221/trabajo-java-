package workshop;

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
public class NumberNine {
    private Logger log = Logger.getLogger(NumberNine.class.getName());
    private final String textString = "La sonrisa sera la mejor arma contra la tristeza";
    /**
     * [
     *  en este atributo finalText almaceno texto cambiado con el metodo remplace
     * ]
     * @author [Yeferson Valencia, alejandro.yand@gmail.com]
     * @since [1,0,0]
     *
     */
    private String finalText = textString.replace("a", "e");

    /**
     * [
     *   El metodo ShowText me permire  mostrar la frase yta cambiada
     * ]
     * @author [Yeferson Valencia, alejandro.yand@gmail.com]
     * @since [1,0,0]
     *
     */
        public void showText() {
            String allMessenger="Old String: "+textString+"Texto Nuevo: "+finalText;
            log.info(allMessenger);
        }
}
