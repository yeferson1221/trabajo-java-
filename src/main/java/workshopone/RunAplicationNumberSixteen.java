package workshopone;

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
public class RunAplicationNumberSixteen {
    public static void main(String[] args) {
        Person person = new Person();
        Logger log = Logger.getLogger(Person.class.getName());
        Scanner in = new Scanner(System.in);

        log.info("Ingresar nombre: ");
        String name=in.nextLine();
        person.setName(name);

        log.info("Ingresar Edad: ");
        int age=in.nextInt();
        person.setAge(age);

        log.info("Ingresar Sexo: ");
        String sex=in.next();
        person.setSex(sex);

        log.info("Ingresar Peso: ");
        Double weig=in.nextDouble();
        person.setWeight(weig);

        log.info("Ingresar Altura: ");
        Double heig=in.nextDouble();
        person.setHeight(heig);


        Person numberUne = new Person(name,age,sex,weig,heig);
        numberUne.generateDni();
        numberUne.showObjectUne();


        Person numberTwo = new Person(name,age,sex);
        numberTwo.generateDni();
        numberTwo.showObjectTwo();

        Person numberThree = new Person();
        numberThree.showObjectTwo();
        numberThree.generateDni();
    }
}
