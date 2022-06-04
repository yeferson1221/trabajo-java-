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
public class NumberTwelve {
        public void introInfo() {
            Logger log = Logger.getLogger(NumberTwelve.class.getName());
            Scanner in=new Scanner(System.in);
            log.info("Ejercicio 12: Comparar palabras");
            log.info("Palabra 1: ");
            String wordUne=in.nextLine();
            log.info("Palabra 2: ");
            String wordTwo=in.nextLine();
            comparation(wordUne,wordTwo);
        }

        public static void comparation(String wordUne, String wordTwo){
            Logger log = Logger.getLogger(NumberTwelve.class.getName());
            String [] arrayWord1=wordUne.split("");
            String [] arrayWord2=wordTwo.split("");
            if(wordUne.equals(wordTwo)){
                log.info("Son iguales.");
            }else{
                if(arrayWord1.length>arrayWord2.length){
                    for(int i=0; i<arrayWord2.length; i++){
                        if(!(arrayWord1[i].equals(arrayWord2[i]))){
                            String allMessenger = "Diferencia en y \n"+arrayWord1[i]+arrayWord2[i];
                            log.info(allMessenger);
                        }
                    }
                    String allMessenger = "La palabra %s es más larga que %s\n"+wordUne+wordTwo;
                    log.info(allMessenger);
                }else if (arrayWord2.length>arrayWord1.length){
                    for(int i=0; i<arrayWord1.length; i++){
                        if(!(arrayWord2[i].equals(arrayWord1[i]))){
                            String allMessenger = "Diferencia en  y \n"+arrayWord1[i]+arrayWord2[i];
                            log.info(allMessenger);
                        }
                    }
                    String allMessenger = "La palabra  es más larga que \n"+wordTwo+wordUne;
                    log.info(allMessenger);
                }else{
                    for(int i=0; i<arrayWord1.length; i++){
                        if(!(arrayWord2[i].equals(arrayWord1[i]))){
                            String allMessenger = "Diferencia en y \n"+arrayWord1[i]+arrayWord2[i];
                            log.info(allMessenger);
                        }
                    }

                }
            }
            log.info("...............................");
        }

}
