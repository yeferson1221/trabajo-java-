package workshop;
import java.util.logging.Logger;
/**
 * [
 *   clase NumberUne hace referencia al algoritmo numero 1 del taller
 *   contiene 2 atributos de tipo numerico y un metodo que no devuelve nada
 * ]
 * @version [1,0.0]
 *
 * @author [Yeferson Valencia, alejandro.yand@gmail.com]
 * @since [1,0,0]
 *
 */
public class NumberOne {

    private String result;

    private Logger log = Logger.getLogger(NumberOne.class.toString());

    /**
     * [
     *   metodo elderNumer tiene la capacidad de detectar el mayor de estos numeros
     * ]
     * @version [1,0.0]
     *
     * @author [Yeferson Valencia, alejandro.yand@gmail.com]
     * @since [1,0,0]
     *
     */
    public void elderNumber(){
        Integer number1 = 15;
        Integer number2 = 10;
        if(number1 > number2){
            result="El numero mayor es: "+ number1;
        }else if(number1 < number2){
            result=("El numero Mayor es: "+ number2);
        }else{
            result="los numeros son iguales";
        }
        log.info(result);
    }

}
