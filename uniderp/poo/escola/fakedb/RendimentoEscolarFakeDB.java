package uniderp.poo.escola.fakedb;
import java.util.ArrayList;
import java.util.List;
import uniderp.poo.escola.dominio.RendimentoEscolar;

public class RendimentoEscolarFakeDB {
    private List<RendimentoEscolar> rendimentos = new ArrayList<>();
    private int nextCodigo = 1;

    public void adicionarRendimento(RendimentoEscolar rendimento) {
        rendimento.setCodigo(nextCodigo++);
        rendimentos.add(rendimento);
    }

    public List<RendimentoEscolar> listarRendimentos() {
        return rendimentos;
    }

    // Outros métodos, como obter rendimentos por aluno ou turma, podem ser adicionados conforme necessário.
}
