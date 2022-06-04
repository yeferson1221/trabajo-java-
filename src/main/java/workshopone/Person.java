package workshopone;
import workshop.NumberTwo;
import java.util.Random;
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

public class Person {
    private Logger log = Logger.getLogger(NumberTwo.class.getName());
    public final  int dowW=-1;
    public final  int goodW=0;
    public final int upW=1;
    private final String sexFinal="H";
    private String name;
    private int age;
    private Random dni;
    private String sex;
    private Double weight;
    private Double height;

    public Person(String name, int age, String sex, Double weight, Double height) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        checkSex(sex);
        this.weight = weight;
        this.height = height;
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        checkSex(sex);
        this.weight = 0.0;
        this.height = 0.0;
    }

    public Person(){
        this.name = "";
        this.age = 0;
        this.sex = sexFinal;
        this.weight = 0.0;
        this.height = 0.0;
    }

    public String calculateImc(){
        double imc = weight/(Math.pow(height,2));
        if(weight == 0){
            String allMessenger = "bajo de peso: "+dowW;
            return allMessenger;
        }else{
            if(imc<20){
                String allMessenger = "bajo de peso: "+dowW;
                return allMessenger;
            }else if(imc<=25 && imc>=20){
                String allMessenger = "buen peso: "+goodW;
                return allMessenger;
            }
            String allMessenger = "gordo: "+upW;
            return allMessenger;
        }
    }

   public String older(){
        if(age>=18){
            String allMessenger = "ES mayor de edad: "+age;
            return allMessenger;
        }
       String allMessenger = "ES menor de edad: "+age;
       return allMessenger;
    }

    public void checkSex(String sex){
        if(sex.equals("F")){
            this.sex=sexFinal;
        }
    }

    @Override
    public String toString() {
        return "NumberSixteen{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dni='" + dni + '\'' +
                ", sex='" + sex + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    public void generateDni(){
        Random r2 = new Random(4234);
        dni = r2;
        String dniFinal= "Su DNI es: "+dni;
        log.info(dniFinal);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void showObjectUne(){
        String allMessenger = "\n.....................................\n"+"Nombre es 1: "+name+
                "\nSu Edad es: "+older()+"\nEl sexo es: "+sex+"\nSu peso es: "+
                weight+"\nSu altura es: "+height+"\n El Cumplimuento Imc: "+calculateImc();
        log.info(allMessenger);

    }
    public void showObjectTwo(){
        String allMessenger = "\n.....................................\n"+"Nombre en el objeto 2: "+name+
                "\nSu Edad es: "+older()+"\nEl sexo es: "+sex+"\n El Cumplimuento Imc: "+calculateImc();
        log.info(allMessenger);
    }
}
