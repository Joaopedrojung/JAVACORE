package AULAS.MARATONAJAVA.INTRODUCAO.Npolimorfismo.servico;

import AULAS.MARATONAJAVA.INTRODUCAO.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no Banco de dados");
    }
}
