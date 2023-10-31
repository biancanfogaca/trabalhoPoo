package uniderp.poo.escola.fakedb;

import java.util.ArrayList;
import java.util.List;

public class DisciplinaFakeDB {

    private List<Disciplina> disciplinas = new ArrayList<>();
    private int nextCodigo = 1;

    public DisciplinaFakeDB() {
        disciplinas.add(new Disciplina(1, "Matemática"));
        disciplinas.add(new Disciplina(2, "Português"));
        disciplinas.add(new Disciplina(3, "História"));
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplina.setCodigo(nextCodigo++);
        disciplinas.add(disciplina);
    }

    public Disciplina obterDisciplinaPorCodigo(int codigo) {
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getCodigo() == codigo) {
                return disciplina;
            }
        }
        return null;
    }

    public List<Disciplina> listarDisciplinas() {
        return disciplinas;
    }

    public void excluirDisciplina(int codigo) {
        Disciplina disciplina = obterDisciplinaPorCodigo(codigo);
        if (disciplina != null) {
            disciplinas.remove(disciplina);
        }
    }
}
