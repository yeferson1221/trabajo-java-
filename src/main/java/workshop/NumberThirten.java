package workshop;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Logger;
public class NumberThirten {
    public void dayDate() {
        Logger log = Logger.getLogger(NumberOne.class.toString());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String allMenssenger = "la fecha es: "+dtf.format(LocalDateTime.now());
        log.info(allMenssenger);
    }
}
