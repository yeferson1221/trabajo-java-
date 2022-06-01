package workshop;

import java.util.Scanner;
import java.util.logging.Logger;

public class NumberSeven {
    private Logger log = Logger.getLogger(NumberOne.class.toString());
    public void number() {

        Scanner entry = new Scanner(System.in);
        int number0=0;
        int  number=0;
        int attempts=0;

        do{
            attempts++;
            log.info("Ingresar un numero please: ");
            number=entry.nextInt();
            if (number==number0){
                log.info("El numero es mas igual 0: ");

            }else if(number>number0){
                log.info("El numero es mayor: ");
            }

        }while(number!=number0);
        String allMessenger = "numero correcto en  "+ attempts+ " intentos";
        log.info(allMessenger);  //attempts-intentos
    }
}
