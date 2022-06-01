package workshopThree;

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

    public String toString(){
        return "Informacion del videojuego: \n" +
                "\tTitulo: "+title+"\n" +
                "\tHoras estimadas: "+extraHours+"\n" +
                "\tGenero: "+gender+"\n" +
                "\tCompañia: "+creator;
    }

    public int compareTo(Object o){
        //Haciendo el downcasting
        Game v=(Game) o;
        if(extraHours>v.getExtraHours()){
            return 1;
        }else if(extraHours<v.getExtraHours()){
            return -1;
        }else{
            return 0;
        }
    }


    public void entregar(){
        delivered=true;
    }


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
