package AULAS.MARATONAJAVA.INTRODUCAO.Gassociacao.test;


import AULAS.MARATONAJAVA.INTRODUCAO.Gassociacao.domain.Jogador;
import AULAS.MARATONAJAVA.INTRODUCAO.Gassociacao.domain.Time;

public class JogadorTest02 {
    static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        jogador1.imprime();
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);

        jogador1.imprime();
    }

}
