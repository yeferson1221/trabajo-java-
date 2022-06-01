package workshop;

import java.util.logging.Logger;

public class NumberSix {
    private int number=0;
    private int number1=0;
    private Logger log = Logger.getLogger(NumberSix.class.toString());
    public void numberPar(){
        for(number=0; number<=100;number++) {
            if(number%2==0){
                String allMessenger = "El numero es par : "+number;
                log.info(allMessenger);
            }
            number++;
        }
    }

    public void numberInpar(){
        for(number=0; number<=100;number++) {
            if((number1%2)!=0){
                String allMessenger = "El numero es par : "+number1;
                log.info(allMessenger);
            }
            number1++;
        }
    }

}
