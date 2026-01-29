package AULAS.MARATONAJAVA.INTRODUCAO.Npolimorfismo.servico;

import AULAS.MARATONAJAVA.INTRODUCAO.Npolimorfismo.domain.Computador;
import AULAS.MARATONAJAVA.INTRODUCAO.Npolimorfismo.domain.Produto;
import AULAS.MARATONAJAVA.INTRODUCAO.Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {


    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if (produto instanceof Tomate) {
            String dataValidade = (((Tomate) produto).getDataValidade());

            System.out.println(dataValidade);
        }

    }
}
