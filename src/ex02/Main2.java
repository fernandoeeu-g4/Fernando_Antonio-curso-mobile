package ex02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.##");

        System.out.println("Entre com a altura da lata de oleo...");
        double altura_lata = s1.nextDouble();
        System.out.println("Entre com o raio da lata...");
        double raio = s1.nextDouble();
        double resultado = altura_lata * Math.PI * Math.pow(raio, 2);

        System.out.println("O volume da lata é: " + df.format(resultado));

    }
}
