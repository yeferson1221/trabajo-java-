import workshop.*;
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
public class RunAplication {
    public static void main(String[] args) {

        Logger log = Logger.getLogger(RunAplication.class.getName());
        Scanner in = new Scanner(System.in);
        log.info("Ingresar opcion");
        int option= in.nextInt();

        /**
         * [
         *   clase NumberNine contiene un logger para imprimir por consola
         *   tiene una constante con una frase la cual la letra a sera cambiada por la letra e
         * ]
         * @author [Yeferson Valencia, alejandro.yand@gmail.com]
         * @since [1,0,0]
         *
         */
        switch (option){
            case 1:
                NumberOne numberOne = new NumberOne();
                numberOne.elderNumber();
                break;
            case 2:
                NumberTwo numberTwo = new NumberTwo();
                numberTwo.introNumber();
                numberTwo.elderNumber();
                break;
            case 3:
                NumberThree numberThree = new NumberThree();
                numberThree.circle();
                break;
            case 4:
                NumberFour numberFour = new NumberFour();
                numberFour.calculateIva();
                break;
            case 5:
                NumberFive numberFive = new NumberFive();
                numberFive.numberPar();
                numberFive.numberInpar();
                break;
            case 6:
                NumberSix numberSix = new NumberSix();
                numberSix.numberPar();
                numberSix.numberInpar();
                break;
            case 7:
                NumberSeven numberSeven = new NumberSeven();
                numberSeven.number();
                break;
            case 8:
                NumberEight numberEight = new NumberEight();
                numberEight.dayFree();
                break;
            case 9:
                NumberNine numberNine = new NumberNine();
                numberNine.showText();
                break;
            case 10:
                NumberTen numberTen = new NumberTen();
                numberTen.showText();
                break;
            case 11:
                NumberEleven numberEleven = new NumberEleven();
                numberEleven.showText();
                numberEleven.wordCount();
                break;
            case 12:
                NumberTwelve numberTwelve = new NumberTwelve();
                numberTwelve.introInfo();
                break;
            case 13:
                NumberThirten numberThirten = new NumberThirten();
                numberThirten.dayDate();
                break;
            case 14:
                NumberFourteen numberFourteen = new NumberFourteen();
                numberFourteen.calculateNumber();
                break;
            case 15:
                NumberFifteen numberFifteen = new NumberFifteen();
                numberFifteen.showMenu();
                break;
            default:
                log.info("error" );
                break;
        }
    }

}
