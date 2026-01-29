package AULAS.MARATONAJAVA.INTRODUCAO.Gassociacao.test;

import AULAS.MARATONAJAVA.INTRODUCAO.Gassociacao.domain.Jogador;
import AULAS.MARATONAJAVA.INTRODUCAO.Gassociacao.domain.Time;

public class JogadorTest03 {
    static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Ronaldo");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador.imprime();

        System.out.println("--- Time ---");
        time.imprime();
    }
}
