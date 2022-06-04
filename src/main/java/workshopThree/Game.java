package workshopThree;
/**
 * [
 *   clase Game que implemente la iunterface Deliverablea, tiene sus atributos private
 *   los tres constructores, uno con argumentos completos, otro solo con dos y el ultimo
 *   por defecto
 * ]
 * @version [1,0.0]
 *
 * @author [Yeferson Valencia, alejandro.yand@gmail.com]
 * @since [1,0,0]
 *
 */
public class Game implements Deliverable {

    private final int extraHoursFinal=10;
    private final boolean deliveredFinal=false;
    //Atributos
    private String title;
    private int extraHours;
    private boolean delivered;
    private String gender;
    private String creator;

    public Game() {
        this.title="";
        this.extraHours=extraHoursFinal;
        this.delivered=deliveredFinal;
        this.gender="";
        this.creator="";
    }

    public Game(String title, int extraHours) {
        this.title = title;
        this.extraHours = extraHours;
        this.gender="";
        this.creator="";
    }

    public Game(String title, int extraHours, String gender, String creator) {
        this.title = title;
        this.extraHours = extraHours;
        this.gender = gender;
        this.creator = creator;
    }

    /**
     * [
     *  Getter y setter
     * ]
     * @version [1,0.0]
     *
     * @author [Yeferson Valencia, alejandro.yand@gmail.com]
     *
     */
    public String getTitle() {
        return title;
    }

    public int getExtraHours() {
        return extraHours;
    }

    public String getGender() {
        return gender;
    }

    public String getCreator() {
        return creator;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setExtraHours(int extraHours) {
        this.extraHours = extraHours;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * [
     *   contiene el ToString que pedian en el Teabajo
     * ]
     * @version [1,0.0]
     *
     * @author [Yeferson Valencia, alejandro.yand@gmail.com]
     *
     */
    public String toString(){
        return "Informacion del videojuego: \n" +
                "\tTitulo: "+title+"\n" +
                "\tHoras estimadas: "+extraHours+"\n" +
                "\tGenero: "+gender+"\n" +
                "\tCompañia: "+creator;
    }

    /**
     * [
     *   El metodo compareTo para hacer la comparacion de las horas Extras
     * ]
     * @version [1,0.0]
     *
     * @author [Yeferson Valencia, alejandro.yand@gmail.com]
     * @since [1,0,0]
     *
     */
    public int compareTo(Object o){
        Game v=(Game) o;
        if(extraHours>v.getExtraHours()){
            return 1;
        }else if(extraHours<v.getExtraHours()){
            return -1;
        }else{
            return 0;
        }
    }

    /**
     * [
     *   El metodo entregar es un booleano  con el fin  de
     *   Entrgo True se instancia este
     * ]
     * @author [Yeferson Valencia, alejandro.yand@gmail.com]
     */
    public void entregar(){
        delivered=true;
    }

    /**
     * [
     *   El metodo   devolver es un booleano  con el fin  de
     *   si devolvio  instancia este
     *   False
     * ]
     * @author [Yeferson Valencia, alejandro.yand@gmail.com]
     */
    public void devolver(){
        delivered=false;
    }


    public boolean isEntregado(){
        if(delivered){
            return true;
        }else{
            return false;
        }
    }
}
