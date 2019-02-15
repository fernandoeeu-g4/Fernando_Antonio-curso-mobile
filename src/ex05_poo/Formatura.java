package ex05_poo;

public class Formatura extends Evento {
    private String curso;
    private String instituicao;
    private String coordenador;

    public Formatura(String curso, String instituicao, String coordenador) {
        this.curso = curso;
        this.instituicao = instituicao;
        this.coordenador = coordenador;
    }

    public Formatura() {}

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }

    public void gerarConvite() {
        System.out.println("Venha para a formatura do curso " + this.curso + ",\n" +
                "que acontecerá no auditório principal da " + this.instituicao + ",\n" +
                "com apresentação do(a) coordenador(a) " + this.coordenador + ".");
    }
}
