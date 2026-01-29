package AULAS.MARATONAJAVA.INTRODUCAO.Gassociacao.test;

import AULAS.MARATONAJAVA.INTRODUCAO.Gassociacao.domain.Escola;
import AULAS.MARATONAJAVA.INTRODUCAO.Gassociacao.domain.Professor;

public class EscolaTest01 {
    static void main(String[] args) {
        Professor professor1 = new Professor("Joao");
        Professor professor2 = new Professor("Pedro");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Uninga", professores);

        escola.imprime();
    }
}
