package workshop;

import java.util.*;
import java.util.logging.Logger;

public class NumberEleven {
    Scanner in = new Scanner(System.in);
    private Logger log = Logger.getLogger(NumberEleven.class.getName());


    public void showText(){
        log.info("ingresar palabra: ");
        String text=in.nextLine();
        int length=text.length();
        String allMessenger = "La palabra es: "+text+" y numero de letras es : "+length;
        log.info(allMessenger);
    }

    public void wordCount() {
        String s = "aasdsaaadccdcsdddgghhh";
        String[] split = s.split("");
        HashSet<String> hashSet = new HashSet<String>(Arrays.asList(split));
        TreeMap<String, Integer> hashMap = new TreeMap<>();
        for (String s1 : hashSet) {
            int num=0;
            for (int i = 0; i < split.length; i++) {
                if(s1.equals(split[i])){
                    num++;
                }
            }
            hashMap.put(s1,num);
        }
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String allMessenger =entry.getKey()+"("+entry.getValue()+")\t";
            log.info(allMessenger);
        }
    }

}
