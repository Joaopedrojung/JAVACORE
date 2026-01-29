package AULAS.MARATONAJAVA.INTRODUCAO.Npolimorfismo.servico;

import AULAS.MARATONAJAVA.INTRODUCAO.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um Arquivo");
    }
}
