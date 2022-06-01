package workshop;
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
public class NumberFive {

    private int number;
    private int number1;
    private Logger log = Logger.getLogger(NumberFive.class.toString());

    public void numberPar(){
        while (number<=100) {
            if(number%2==0){
                String result = String.valueOf(number);
                log.info(result);
            }
            number++;
        }
    }

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
