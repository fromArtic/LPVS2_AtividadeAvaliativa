package ex01;

/**
 *
 * @author Jv Loreti
 */

/**
 * d)
 */

public class Main{
    public static void main(String[] args){
        //Músicas
        Musica msc1 = new Musica("Agua de beber", "Antonio Carlos Jobim", "Astrud Gilberto", 140);
        Musica msc2 = new Musica("O mar serenou", "Candeia", "Clara Nunes", 179);
        Musica msc3 = new Musica("Rapaz Folgado", "Noel Rosa", "Martinho da Vila e Martnália", 179);
        
        //Playlist
        Playlist playlist = new Playlist();
        playlist.add(msc1);
        playlist.add(msc2);
        playlist.add(msc3);
        
        //Remove música
        playlist.remove("O mar serenou");
        //Altera música
        playlist.modify("Rapaz Folgado", "Moon is up", "Keith Richards", "Rolling Stones", 4);
        
        //Saída
        System.out.println(playlist);
    }
}
