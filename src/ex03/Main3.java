package ex03;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Entre com o salário bruto...");
        double salario_bruto = s1.nextDouble();
        System.out.println("Entre com o valor da prestação...");
        double prestacao = s1.nextDouble();
        double parcela_max = salario_bruto * 0.3;
        if (prestacao > parcela_max) {
            System.err.println("A parcela ultrapassa 30% do salário bruto :(");
        } else {
            System.out.println("Parcela aprovada!!");
        }


    }
}