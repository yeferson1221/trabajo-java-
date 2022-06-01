package workshop;

import java.util.logging.Logger;

public class NumberNine {
    private Logger log = Logger.getLogger(NumberNine.class.getName());
    private String textString = "La sonrisa sera la mejor arma contra la tristeza";
    private String finalText = textString.replace("a", "e");

        public void showText() {
            String allMessenger="Old String: "+textString+"Texto Nuevo: "+finalText;
            log.info(allMessenger);
        }
}
