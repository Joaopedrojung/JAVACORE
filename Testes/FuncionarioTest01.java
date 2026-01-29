package Testes;

import EXERCICIO.Funcionario;

public class FuncionarioTest01 {
    static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Kratos");
        funcionario.setIdade(39);
        funcionario.setSalarios(new double[]{1200, 900.30, 1000});

        funcionario.imprime();
        funcionario.imprimeMediaSalario();
    }
}
