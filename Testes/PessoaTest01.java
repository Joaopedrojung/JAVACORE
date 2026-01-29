package Testes;

import EXERCICIO.Pessoa;

public class PessoaTest01 {
    static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jiraya");
        pessoa.setIdade(60);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
