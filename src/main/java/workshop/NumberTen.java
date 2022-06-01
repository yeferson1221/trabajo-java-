package workshop;

import java.util.Scanner;
import java.util.logging.Logger;

public class NumberTen {
    private Logger log = Logger.getLogger(NumberTen.class.getName());
    Scanner in  = new Scanner(System.in);
    private String textString;


    public void showText() {
        log.info("Ingresar Frase");
        textString=in.nextLine();
        String finalText = textString.replace(" ", "");
        String allMessenger = "Old String: "+textString+"Texto Nuevo: "+finalText;
        log.info(allMessenger);
    }
}
