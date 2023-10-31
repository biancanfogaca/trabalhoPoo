package uniderp.poo.escola.dominio;

public class Trabalho {
    private int codigo;
    private Disciplina disciplina;
    private String descricao;

    public Trabalho(int codigo, Disciplina disciplina, String descricao) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
