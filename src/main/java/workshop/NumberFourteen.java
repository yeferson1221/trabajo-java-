package workshop;

import java.util.Scanner;
import java.util.logging.Logger;

public class NumberFourteen {
    private  Logger log = Logger.getLogger(NumberFourteen.class.getName());
    public void calculateNumber() {
        Scanner in = new Scanner(System.in);
        log.info("ingrerar numero");
        int number=in.nextInt();
        for(int i=number;i<=1000;i+=2){
            String numString= "Number:" + i;
            log.info(numString);
        }
    }
}
