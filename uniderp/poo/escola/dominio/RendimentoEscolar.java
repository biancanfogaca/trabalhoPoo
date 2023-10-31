package uniderp.poo.escola.dominio;
import java.util.List;
import uniderp.poo.escola.dominio.Turma;

public class RendimentoEscolar{
    private Aluno aluno;
    private Turma turma;
    private double nota1aProva;
    private double nota2aProva;
    private List<NotaTrabalho> trabalhos;
    private double mediaTrabalhos;
    private double mediaGeral;

    public RendimentoEscolar(Aluno aluno, Turma turma, double nota1aProva, double nota2aProva, List<NotaTrabalho> trabalhos) {
        this.aluno = aluno;
        this.turma = turma;
        this.nota1aProva = nota1aProva;
        this.nota2aProva = nota2aProva;
        this.trabalhos = trabalhos;
        // Calcule a média dos trabalhos e a média geral aqui
        this.mediaTrabalhos = calcularMediaTrabalhos();
        this.mediaGeral = calcularMediaGeral();
    }

    // Métodos para calcular as médias
    // ...

    // Getters e Setters
    // ...
}
