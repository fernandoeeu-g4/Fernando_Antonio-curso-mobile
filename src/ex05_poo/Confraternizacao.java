package ex05_poo;

public class Confraternizacao extends Evento {
    private String contaBancaria;
    private String banco;
    private String agencia;

    public String getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(String contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Confraternizacao(String contaBancaria, String banco, String agencia) {
        this.contaBancaria = contaBancaria;
        this.banco = banco;
        this.agencia = agencia;
    }

    public Confraternizacao() {}

   public void GerarConvite() {
       System.out.println("Bem-vindo a " + super.getNome() + "!! \n" +
               "Deposite R$20,00 para participar.\n" +
               "Dados: conta: " + this.contaBancaria + "\n" +
               "       agência:  " + this.agencia + "\n" +
               "       banco: " + this.banco );
   }
}
