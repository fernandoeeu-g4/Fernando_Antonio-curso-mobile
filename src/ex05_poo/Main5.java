package ex05_poo;

import ex05_poo.Aniversario;
import ex05_poo.Formatura;

import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {

        String delimitador = "//////////////////////////////////";

        Aniversario a1 = new Aniversario();
        a1.setNome("Aniversário do Fernando");
        a1.setAniversariante("Fernando Antonio");
        a1.setNomeDJ("Cleiton Rasta");
        a1.gerarConvite();
        a1.PedirMusica("BTS - DNA");
        a1.Parabenizar();
        System.out.println(delimitador);

        Formatura f1 = new Formatura();
        f1.setCurso("Ciência da Computação");
        f1.setInstituicao("Universidade da Amazônia - UNAMA");
        f1.setCoordenador("Alan Marcel");
        f1.gerarConvite();
        System.out.println(delimitador);

        Confraternizacao c1 = new Confraternizacao();
        c1.setNome("Confra dos Brother");
        c1.setAgencia("1236-4");
        c1.setContaBancaria("1250");
        c1.setBanco("NUBANK");
        c1.GerarConvite();
    }
}
