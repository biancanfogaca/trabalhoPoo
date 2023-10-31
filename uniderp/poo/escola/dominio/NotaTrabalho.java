package uniderp.poo.escola.dominio;
import uniderp.poo.escola.dominio.Trabalho;

public class NotaTrabalho extends Trabalho {
    private Aluno aluno;
    private double nota;

    public NotaTrabalho(int codigo, Disciplina disciplina, String descricao, Aluno aluno, double nota) {
        super(codigo, disciplina, descricao);
        this.aluno = aluno;
        this.nota = nota;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}