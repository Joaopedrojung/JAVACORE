package AULAS.MARATONAJAVA.INTRODUCAO.Npolimorfismo.test;

import AULAS.MARATONAJAVA.INTRODUCAO.Npolimorfismo.repositorio.Repositorio;
import AULAS.MARATONAJAVA.INTRODUCAO.Npolimorfismo.servico.RepositorioBancoDeDados;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTest01 {
    static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
        List<String> list = new ArrayList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Kuririn");
        System.out.println(list);
    }
}
