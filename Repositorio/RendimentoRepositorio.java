package uniderp.poo.escola.repositorio;


public class RendimentoEscolarRepositorio extends BaseGenericaCRUD<RendimentoEscolarFakeDB, RendimentoEscolar> {

    @Override
    public RendimentoEscolar Create(RendimentoEscolar instancia) {
        fakeDB.adicionarRendimentoEscolar(instancia);
        return instancia;
    }

    @Override
    public RendimentoEscolar Read(int codigo) {
        return fakeDB.obterRendimentoEscolarPorCodigo(codigo);
    }

    @Override
    public RendimentoEscolar Update(RendimentoEscolar instancia) {
        fakeDB.atualizarRendimentoEscolar(instancia);
        return instancia;
    }

    @Override
    public RendimentoEscolar Delete(int codigo) {
        RendimentoEscolar rendimento = fakeDB.obterRendimentoEscolarPorCodigo(codigo);
        if (rendimento != null) {
            fakeDB.excluirRendimentoEscolar(codigo);
        }
        return rendimento;
    }
}
