package workshop;
import java.util.logging.Logger;
/**
 * [
 *   clase NumberUne hace referencia al algoritmo numero 2 del taller
 *   contiene 2 atributos de tipo numerico y dos metodos
 * ]
 * @author [Yeferson Valencia, alejandro.yand@gmail.com]
 * @since [1,0,0]
 */
public class NumberFive {

    private int number;
    private int number1;
    private Logger log = Logger.getLogger(NumberFive.class.toString());

    /**
     * [
     *  El metodo NumberPar perimite mostrar los mumeros pares pero con un
     *  siclo while donde este termina cuando numero sea igual o menor 100
     * ]
     * @author [Yeferson Valencia, alejandro.yand@gmail.com]
     */
    public void numberPar(){
        while (number<=100) {
            if(number%2==0){
                String result = String.valueOf(number);
                log.info(result);
            }
            number++;
        }
    }

    /**
     * [
     *  El metodo NumberImpar perimite mostrar los mumeros Impares pero con un
     *  siclo while donde este termina cuando numero sea igual o menor 100
     * ]
     * @author [Yeferson Valencia, alejandro.yand@gmail.com]
     */
    public void numberInpar(){
        while (number1<=100) {
            if((number1%2)!=0){
                String result = String.valueOf(number1);
                log.info(result);
            }
            number1++;
        }
    }


}
