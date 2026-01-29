package AULAS.MARATONAJAVA.INTRODUCAO.Oexception.runtime.test;

import java.io.IOException;

public class RuntimeExceptionTest02 {
    static void main(String[] args) {
        divisao(1, 0);

        System.out.println("Código finalizado");
    }

    private static int divisao(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, não pode ser zero");
        }
        return a / b;
    }
}