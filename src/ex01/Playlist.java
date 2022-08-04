package ex01;

/**
 *
 * @author Jv Loreti
 */

/**
 * b) e c)
 */

public class Playlist{
    private Musica musicas[];
    private int MAX = 200; //Define o limite de músicas suportada pela playlist
    private int duracaoTotal = 0, h, min; //Variáveis para calcular a duração total da playlist
    
    //Incorpora o limite ao vetor
    public Playlist(){
        this.musicas = new Musica[MAX];
    }
    
    //Adiciona músicas à playlist
    public boolean add(Musica m){
        for(int i = 0; i < MAX; i++){
            if(this.musicas[i] == null){
                this.musicas[i] = m;
                duracaoTotal += this.musicas[i].getDuracao();
                return true;
            }
        }
        return false;
    }
    
    //Remove músicas da playlist
    public boolean remove(String nome){
        for(int i = 0; i < MAX; i++){
            if(this.musicas[i] != null){
                if(this.musicas[i].getNome() == nome){
                    duracaoTotal -= this.musicas[i].getDuracao();
                    this.musicas[i] = null;
                    return true;
                }
            }
        }
        return false;
    }
    
    //Altera músicas da playlist
    public boolean modify(String nome, String newNome, String newCompositor, String newInterprete, int newDuracao){
        for(int i = 0; i < MAX; i++){
            if(this.musicas[i] != null){
                if(this.musicas[i].getNome() == nome){
                    this.musicas[i].setNome(newNome);
                    this.musicas[i].setCompositor(newCompositor);
                    this.musicas[i].setInterprete(newInterprete);

                    duracaoTotal -= this.musicas[i].getDuracao();
                    this.musicas[i].setDuracao(newDuracao);
                    duracaoTotal += this.musicas[i].getDuracao();

                    return true;
                }
            }
        }
        return false;
    }
    
    //Imprime a playlist
    @Override
    public String toString(){
        int count = 0;
        String ret = "-- PLAYLIST --\n";
        for(int i = 0; i < MAX; i++){
            if(musicas[i] != null){
                ret += "\n" + (count + 1) + ".  Título: " + musicas[i].getNome() + "\n";
                ret += "    Compositor: " + musicas[i].getCompositor() + "\n";
                ret += "    Intérprete: " + musicas[i].getInterprete() + "\n";
                ret += "    Duração: " + musicas[i].getDuracao() + "min\n";
                count++;
            }
        }
        if(duracaoTotal >= 60){
            h = duracaoTotal/60;
            min = duracaoTotal - (h * 60);
            ret += "\nDuração total da playlist: " + h + "h e " + min + "min\n";
        }else{
            ret += "\nDuração total da playlist: " + duracaoTotal + "min\n";
        }
        return ret;
    }
}
