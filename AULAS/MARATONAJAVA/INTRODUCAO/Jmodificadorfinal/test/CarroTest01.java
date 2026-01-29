package AULAS.MARATONAJAVA.INTRODUCAO.Jmodificadorfinal.test;

import AULAS.MARATONAJAVA.INTRODUCAO.Jmodificadorfinal.domain.Carro;
import AULAS.MARATONAJAVA.INTRODUCAO.Jmodificadorfinal.domain.Comprador;
import AULAS.MARATONAJAVA.INTRODUCAO.Jmodificadorfinal.domain.Ferrari;

public class CarroTest01 {
    static void main(String[] args) {
        Carro carro = new Carro();


        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Jason");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Dojo");
        ferrari.imprime();
    }
}
