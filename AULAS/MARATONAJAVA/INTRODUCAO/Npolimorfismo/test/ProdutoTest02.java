package AULAS.MARATONAJAVA.INTRODUCAO.Npolimorfismo.test;

import AULAS.MARATONAJAVA.INTRODUCAO.Npolimorfismo.domain.Computador;
import AULAS.MARATONAJAVA.INTRODUCAO.Npolimorfismo.domain.Produto;
import AULAS.MARATONAJAVA.INTRODUCAO.Npolimorfismo.domain.Tomate;

public class ProdutoTest02 {
    static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("------------------");

        Produto produto2 = new Tomate("Saladete", 20);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
}
