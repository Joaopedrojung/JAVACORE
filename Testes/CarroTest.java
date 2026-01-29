package Testes;

import EXERCICIO.Carro;

public class CarroTest {
    static void main() {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fusca Bala";
        carro1.ano = 1900;
        carro1.modelo = "Sport";

        carro2.nome = "Camaro";
        carro2.modelo = "esportivo";
        carro2.ano = 2010;

        System.out.println("\nCarro 1");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("---------------------");

        System.out.println("\nCarro 2");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
