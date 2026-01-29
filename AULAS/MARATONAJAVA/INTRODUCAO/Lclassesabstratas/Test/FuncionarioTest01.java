package AULAS.MARATONAJAVA.INTRODUCAO.Lclassesabstratas.Test;

import AULAS.MARATONAJAVA.INTRODUCAO.Lclassesabstratas.domain.Desenvolvedor;
import AULAS.MARATONAJAVA.INTRODUCAO.Lclassesabstratas.domain.Funcionario;
import AULAS.MARATONAJAVA.INTRODUCAO.Lclassesabstratas.domain.Gerente;


public class FuncionarioTest01 {
    static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Michael", 11000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
