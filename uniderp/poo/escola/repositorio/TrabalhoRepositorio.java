package uniderp.poo.escola.repositorio;

import uniderp.poo.escola.fakedb.TrabalhoFakeDB;
import uniderp.poo.escola.dominio.Trabalho;

public class TrabalhoRepositorio extends BaseGenericaCRUD<TrabalhoFakeDB, Trabalho> {

    @Override
    public Trabalho Create(Trabalho instancia) {
        fakeDB.adicionarTrabalho(instancia);
        return instancia;
    }

    @Override
    public Trabalho Read(int codigo) {
        return fakeDB.obterTrabalhoPorCodigo(codigo);
    }

    @Override
    public Trabalho Update(Trabalho instancia) {
        fakeDB.atualizarTrabalho(instancia);
        return instancia;
    }

    @Override
    public Trabalho Delete(int codigo) {
        Trabalho trabalho = fakeDB.obterTrabalhoPorCodigo(codigo);
        if (trabalho != null) {
            fakeDB.excluirTrabalho(codigo);
        }
        return trabalho;
    }
}
