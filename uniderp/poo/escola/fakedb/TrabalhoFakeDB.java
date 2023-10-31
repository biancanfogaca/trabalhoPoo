package uniderp.poo.escola.fakedb;
import java.util.ArrayList;
import java.util.List;
import uniderp.poo.escola.dominio.Trabalho;

public class TrabalhoFakeDB {
    private List<Trabalho> trabalhos = new ArrayList<>();
    private int nextCodigo = 1;

    public void adicionarTrabalho(Trabalho trabalho) {
        trabalho.setCodigo(nextCodigo++);
        trabalhos.add(trabalho);
    }

    public Trabalho obterTrabalhoPorCodigo(int codigo) {
        for (Trabalho trabalho : trabalhos) {
            if (trabalho.getCodigo() == codigo) {
                return trabalho;
            }
        }
        return null;
    }

    public List<Trabalho> listarTrabalhos() {
        return trabalhos;
    }

    // Outros métodos, como atualização e exclusão, podem ser adicionados conforme necessário.
}
