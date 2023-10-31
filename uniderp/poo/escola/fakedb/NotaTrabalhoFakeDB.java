package uniderp.poo.escola.fakedb;
import java.util.ArrayList;
import java.util.List;
import uniderp.poo.escola.dominio.NotaTrabalho;

public class NotaTrabalhoFakeDB {
    private List<NotaTrabalho> notas = new ArrayList<>();
    private int nextCodigo = 1;

    public void adicionarNotaTrabalho(NotaTrabalho nota) {
        nota.setCodigo(nextCodigo++);
        notas.add(nota);
    }

    public List<NotaTrabalho> listarNotasTrabalho() {
        return notas;
    }

    // Outros métodos, como obter notas por aluno ou trabalho, podem ser adicionados conforme necessário.
}
