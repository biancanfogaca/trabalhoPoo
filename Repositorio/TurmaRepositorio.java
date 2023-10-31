package uniderp.poo.escola.repositorio;

import uniderp.poo.escola.fakedb.TurmaFakeDB;
import uniderp.poo.escola.dominio.Turma;

public class TurmaRepositorio extends BaseGenericaCRUD<TurmaFakeDB, Turma> {

    @Override
    public Turma Create(Turma instancia) {
        fakeDB.adicionarTurma(instancia);
        return instancia;
    }

    @Override
    public Turma Read(int codigo) {
        return fakeDB.obterTurmaPorCodigo(codigo);
    }

    @Override
    public Turma Update(Turma instancia) {
        fakeDB.atualizarTurma(instancia);
        return instancia;
    }

    @Override
    public Turma Delete(int codigo) {
        Turma turma = fakeDB.obterTurmaPorCodigo(codigo);
        if (turma != null) {
            fakeDB.excluirTurma(codigo);
        }
        return turma;
    }
}
