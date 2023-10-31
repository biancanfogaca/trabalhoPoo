package uniderp.poo.escola.fakedb;

import java.util.ArrayList;


public class ProfessorFakeDB extends BaseGenericaFakeDB<Professor> {

    @Override
    protected void CarregarDados() {
        this.tabela = new ArrayList<Professor>();
    }

    public ProfessorFakeDB(){
        super();
    }

}