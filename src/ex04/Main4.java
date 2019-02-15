package ex04;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Entre com um valor numérico qualquer...");
        double valor = s1.nextDouble();

        if (valor > 100 || valor < 0) {
            System.err.println("O valor não encontra-se entre 0 e 100...");
        } else {
            System.out.println("O valor está entre 0 e 100!!!");
        }

    }
}
