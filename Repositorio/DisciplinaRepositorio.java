package uniderp.poo.escola.repositorio;

import uniderp.poo.escola.fakedb.DisciplinaFakeDB;
import uniderp.poo.escola.dominio.Disciplina;

public class DisciplinaRepositorio extends BaseGenericaCRUD<DisciplinaFakeDB, Disciplina> {

    @Override
    public Disciplina Create(Disciplina instancia) {
        fakeDB.adicionarDisciplina(instancia);
        return instancia;
    }

    @Override
    public Disciplina Read(int codigo) {
        return fakeDB.obterDisciplinaPorCodigo(codigo);
    }

    @Override
    public Disciplina Update(Disciplina instancia) {
        fakeDB.atualizarDisciplina(instancia);
        return instancia;
    }

    @Override
    public Disciplina Delete(int codigo) {
        Disciplina disciplina = fakeDB.obterDisciplinaPorCodigo(codigo);
        if (disciplina != null) {
            fakeDB.excluirDisciplina(codigo);
        }
        return disciplina;
    }
}
