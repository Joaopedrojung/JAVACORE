package AULAS.MARATONAJAVA.INTRODUCAO.Gassociacao.test;

import AULAS.MARATONAJAVA.INTRODUCAO.Gassociacao.domain.Aluno;
import AULAS.MARATONAJAVA.INTRODUCAO.Gassociacao.domain.Local;
import AULAS.MARATONAJAVA.INTRODUCAO.Gassociacao.domain.Professor;
import AULAS.MARATONAJAVA.INTRODUCAO.Gassociacao.domain.Seminario;

public class AssociacaoTest {
    static void main(String[] args) {
        Local local = new Local("Rua das Laranjas");
        Aluno aluno = new Aluno("Percy", 18);
        Professor professor = new Professor("Poseidon", "Pescador");
        Aluno[] alunosParaSeminario = {aluno};


        Seminario seminario = new Seminario("Em busca do raio", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
