package uniderp.poo.escola.fakedb;
import java.util.ArrayList;
import java.util.List;
import uniderp.poo.escola.dominio.Turma;

public class TurmaFakeDB {
    private List<Turma> turmas = new ArrayList<>();
    private int nextCodigo = 1;

    public void adicionarTurma(Turma turma) {
        turma.setCodigo(nextCodigo++);
        turmas.add(turma);
    }

    public Turma obterTurmaPorCodigo(int codigo) {
        for (Turma turma : turmas) {
            if (turma.getCodigo() == codigo) {
                return turma;
            }
        }
        return null;
    }

    public List<Turma> listarTurmas() {
        return turmas;
    }

    // Outros métodos, como atualização e exclusão, podem ser adicionados conforme necessário.
}
