package AULAS.MARATONAJAVA.INTRODUCAO.Eblocosinicializacao.test;
import AULAS.MARATONAJAVA.INTRODUCAO.Eblocosinicializacao.domain.Anime;

public class AnimeTest01 {
    static void main(String[] args) {
        Anime anime = new Anime("Naruto");

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }


    }
}
