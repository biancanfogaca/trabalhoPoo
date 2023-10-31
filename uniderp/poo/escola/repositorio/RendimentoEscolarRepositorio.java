package uniderp.poo.escola.repositorio;

import uniderp.poo.escola.dominio.RendimentoEscolar;
import uniderp.poo.escola.fakedb.RendimentoEscolarFakeDB;

public abstract class RendimentoEscolarRepositorio extends BaseGenericaCRUD<RendimentoEscolarFakeDB, RendimentoEscolar> {

    @Override
    public RendimentoEscolar Create(RendimentoEscolar instancia) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Create'");
    }

    @Override
    public RendimentoEscolar Read(int codigo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Read'");
    }

    @Override
    public RendimentoEscolar Update(RendimentoEscolar instancia) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Update'");
    }

    @Override
    public RendimentoEscolar Delete(int codigo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Delete'");
    }
}
