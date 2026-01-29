package AULAS.MARATONAJAVA.INTRODUCAO.Npolimorfismo.test;

import AULAS.MARATONAJAVA.INTRODUCAO.Npolimorfismo.domain.Computador;
import AULAS.MARATONAJAVA.INTRODUCAO.Npolimorfismo.domain.Produto;
import AULAS.MARATONAJAVA.INTRODUCAO.Npolimorfismo.domain.Tomate;
import AULAS.MARATONAJAVA.INTRODUCAO.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Saladete", 20);
        tomate.setDataValidade("11/12/2026");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
