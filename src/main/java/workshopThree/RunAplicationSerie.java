package workshopThree;

import workshop.NumberFourteen;

import java.util.logging.Logger;

public class RunAplicationSerie {
    public static void main(String[] args) {
        Logger log = Logger.getLogger(NumberFourteen.class.getName());
        //Creamos dos arrays de cada tipo de objeto
        Serie[] listSeries = new Serie[5];
        Game[] listGame = new Game[5];

        //Creamos un objeto en cada posicion del array
        listSeries[0]=new Serie();
        listSeries[1]=new Serie("Deaht Note", "nn");
        listSeries[2]=new Serie("Big Ban Teory", 11, "Humor", "nn-big");
        listSeries[3]=new Serie("Simson", 7 ,"Humor", "nn-simson");
        listSeries[4]=new Serie("Better call Saul", 5, "Thriller", "Vince Gilligan");

        listGame[0]=new Game();
        listGame[1]=new Game("Resident Evil 4", 30, "Aventura", "Capcom");
        listGame[2]=new Game("God of war: Ascension", 30);
        listGame[3]=new Game("Super Mario Galaxy", 30, "Plataforma", "Nintendo");
        listGame[4]=new Game("Child of Light", 200, "Rol", "Ubisoft");

        //entregamos algunos  series
        listSeries[1].entregar();
        listSeries[4].entregar();
        String allMessenggerSeries = "La Serie "+listSeries[1].getTitle()+"está prestada\n"
                +"La seRie "+listSeries[4].getTitle()+" está prestada\n";
        log.info(allMessenggerSeries);

        //entregamos algunos  videojuegos
        listGame[1].entregar();
        listGame[3].entregar();
        String allMessenggerGames ="Ejercicio 18: Series y Videojuegos\n "+ "El videojuego "+listGame[1].getTitle()+"está prestado\n"
                +"La serie "+listGame[3].getTitle()+" está prestada\n";
        log.info(allMessenggerGames);


        log.info("...........................................................................");

        //Recorremos los arrays para contar cuantos entregados hay, tambien los devolvemos

        int entregados=0;

        for(int i=0;i<listSeries.length;i++){
            if(listSeries[i].isEntregado()){
                entregados+=1;
                listSeries[i].devolver();
                String allMessengerSerieDeliverid="La serie "+listSeries[i].getTitle()+" ha sido devuelta\n";
                log.info(allMessengerSerieDeliverid);

            }
            if(listGame[i].isEntregado()){
                entregados+=1;
                listGame[i].devolver();
                String allMessengerGameDeliverid="El video Juego "+listGame[i].getTitle()+" ha sido devuelta\n";
                log.info(allMessengerGameDeliverid);
            }
        }
        String allMessengerDelivered = "\nSe entregaron "+entregados+" articulos y han sido devueltos\n";
        log.info(allMessengerDelivered);


        //Creamos dos objetos con la primera posicion de cada array
        Serie serieMayor=listSeries[0];
        Game videojuegoMayor=listGame[0];

        //Recorremos el array desde la posicion 1 (no 0), comparando el mayor con las posiciones del array
        for(int i=1;i<listSeries.length;i++){
            if(listSeries[i].compareTo(serieMayor)==1){
                serieMayor=listSeries[i];
            }
            if(listGame[i].compareTo(videojuegoMayor)==1){
                videojuegoMayor=listGame[i];
            }

        }

        //Se Muestra toda la informacion del videojuego y serie mayor
        String allMessenger = "Videojuego con más horas estimadas\n"+videojuegoMayor+"\nSerie con más temporadas "+serieMayor;
        log.info(allMessenger);

    }
}
