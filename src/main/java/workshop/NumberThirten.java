package workshop;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
public class NumberThirten {
    public void dayDate() {
        Logger log = Logger.getLogger(NumberOne.class.toString());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String allMenssenger = "la fecha es: "+dtf.format(LocalDateTime.now());
        log.info(allMenssenger);
    }
}
