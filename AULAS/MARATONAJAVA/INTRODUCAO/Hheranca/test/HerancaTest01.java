package AULAS.MARATONAJAVA.INTRODUCAO.Hheranca.test;

import AULAS.MARATONAJAVA.INTRODUCAO.Hheranca.domain.Endereco;
import AULAS.MARATONAJAVA.INTRODUCAO.Hheranca.domain.Funcionario;
import AULAS.MARATONAJAVA.INTRODUCAO.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");
        Pessoa pessoa = new Pessoa("Toyota Nakamoto");
        pessoa.setCpf("11111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Oda Fukushi");
        funcionario.setCpf("22222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        funcionario.imprime();
    }
}
