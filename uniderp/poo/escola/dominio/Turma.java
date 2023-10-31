package uniderp.poo.escola.dominio;

public class Turma {
    private int codigo;
    private Disciplina disciplina;
    private Professor professor;
    private int capacidade;

    public Turma(int codigo, Disciplina disciplina, Professor professor, int capacidade) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
        this.capacidade = capacidade;
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

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}
