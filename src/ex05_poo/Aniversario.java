package ex05_poo;

public class Aniversario extends Evento {
    private String aniversariante;
    private String corBalao;
    private String nomeDJ;
    private String saborBolo;
    private String telefoneBuffet;

    public Aniversario(String aniversariante, String corBalao, String nomeDJ, String saborBolo, String telefoneBuffet) {
        this.aniversariante = aniversariante;
        this.corBalao = corBalao;
        this.nomeDJ = nomeDJ;
        this.saborBolo = saborBolo;
        this.telefoneBuffet = telefoneBuffet;
    }

    public Aniversario() {

    }

    public String getAniversariante() {
        return aniversariante;
    }

    public void setAniversariante(String aniversariante) {
        this.aniversariante = aniversariante;
    }

    public String getCorBalao() {
        return corBalao;
    }

    public void setCorBalao(String corBalao) {
        this.corBalao = corBalao;
    }

    public String getNomeDJ() {
        return nomeDJ;
    }

    public void setNomeDJ(String nomeDJ) {
        this.nomeDJ = nomeDJ;
    }

    public String getSaborBolo() {
        return saborBolo;
    }

    public void setSaborBolo(String saborBolo) {
        this.saborBolo = saborBolo;
    }

    public String getTelefoneBuffet() {
        return telefoneBuffet;
    }

    public void setTelefoneBuffet(String telefoneBuffet) {
        this.telefoneBuffet = telefoneBuffet;
    }

    public void Parabenizar() {
        System.out.println("Parabéns, " + this.aniversariante + " !!!");
    }

    public void PedirMusica(String musica) {
        System.out.println("Põe a música " + musica + " aí, meu consagrado!");
    }

    public void gerarConvite() {
        System.out.println("Venha para o "+ super.getNome() +"\n" +
                "O DJ " + this.nomeDJ + " é a atração principal!")  ;
    }


}
