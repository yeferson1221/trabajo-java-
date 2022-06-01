package workshopThree;

public class Serie implements Deliverable {
    private final int numberSeasonsFinal=3;
    private final boolean deliveredFinal=false;

    //Atributos
    private String title;
    private int numberSeasons;
    private boolean delivered;
    private String gender;
    private String creator;

    //Sobrecarga de constructores
    public Serie(){
        this.title="";
        this.numberSeasons=numberSeasonsFinal;
        this.delivered=deliveredFinal;
        this.gender="";
        this.creator="";
    }

    public Serie(String title, String creator) {
        this.title = title;
        this.creator = creator;
        this.numberSeasons=numberSeasonsFinal;
        this.delivered=deliveredFinal;
        this.gender="";
    }

    public Serie(String title, int numberSeasons, String gender, String creator) {
        this.title = title;
        this.numberSeasons = numberSeasons;
        this.gender = gender;
        this.creator = creator;
    }


    public String getTitle() {
        return title;
    }

    public int getNumberSeasons() {
        return numberSeasons;
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

    public void setNumberSeasons(int numberSeasons) {
        this.numberSeasons = numberSeasons;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCreator(String creator) {
        this.creator= creator;
    }

    @Override
    public String toString() {
        return "Informacion de la Serie: \n" +
                "\tTitulo: "+title+"\n" +
                "\tNumero de temporadas: "+numberSeasons+"\n" +
                "\tGenero: "+gender+"\n" +
                "\tCreador: "+creator;
    }


    public int compareTo(Object o){
        //Haciendo el downcasting
        Serie s=(Serie)o;
        if(numberSeasons>s.getNumberSeasons()){
            return 1;
        }else if(numberSeasons<s.getNumberSeasons()){
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
