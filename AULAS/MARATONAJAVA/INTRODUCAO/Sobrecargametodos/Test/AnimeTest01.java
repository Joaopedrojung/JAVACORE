package AULAS.MARATONAJAVA.INTRODUCAO.Sobrecargametodos.Test;

import AULAS.MARATONAJAVA.INTRODUCAO.Sobrecargametodos.dominio.Anime;

public class AnimeTest01 {

    static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Tokyo","TV", 12, "Terror" );
        anime.imprime();

    }
}
