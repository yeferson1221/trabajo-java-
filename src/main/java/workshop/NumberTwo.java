package workshop;
import java.util.Scanner;
import java.util.logging.Logger;
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
public class NumberTwo {
    private Integer number1;
    private Integer number2;

    private final Logger log = Logger.getLogger(NumberTwo.class.getName());
    /**
     * [
     *   metodo introNumer tiene la capacidad de dejar que el usuario introdusca
     *   los numeros en el sistema
     * ]
     * @author [Yeferson Valencia, alejandro.yand@gmail.com]
     * @since [1,0,0]
     *
     */
    public void introNumber(){
        Scanner in = new Scanner(System.in);
        log.info("Ingresar Numero 1: ");
        number1=in.nextInt();
        log.info("Ingresar Numero 2: ");
        number2=in.nextInt();
    }

    /**
     * [
     *   metodo elderNumer tiene la capacidad de detectar el mayor de estos numeros
     *   Que el usuario ingresa
     * ]
     * @author [Yeferson Valencia, alejandro.yand@gmail.com]
     * @since [1,0,0]
     *
     */
    public void elderNumber(){
        String result;
        if(number1>number2){
            result ="El numero mayor es: "+number1;
        }else{
            result ="El numero Mayor es: "+number2;
        }
        log.info(result);
    }

}