package ex01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.##");

        System.out.println("Entre com o valor da conta...");
        double valor_total = s1.nextDouble();
        double resultado = valor_total * 1.1;

        System.out.println("O valor total, com gorjeta, é: R$: " + df.format(resultado));

    }
}
