package AULAS.MARATONAJAVA.INTRODUCAO.Npolimorfismo.test;

import AULAS.MARATONAJAVA.INTRODUCAO.Npolimorfismo.domain.Computador;
import AULAS.MARATONAJAVA.INTRODUCAO.Npolimorfismo.domain.Televisao;
import AULAS.MARATONAJAVA.INTRODUCAO.Npolimorfismo.domain.Tomate;
import AULAS.MARATONAJAVA.INTRODUCAO.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        Televisao televisao = new Televisao("Samsung 50\" ", 4000);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------------");
        CalculadoraImposto.calcularImposto(televisao);
    }
}
