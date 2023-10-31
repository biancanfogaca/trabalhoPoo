package uniderp.poo.escola.fakedb;
import java.time.LocalDate;
import uniderp.poo.escola.dominio.Aluno;


public class AlunoFakeDB extends BaseGenericaFakeDB<Aluno> {

    @Override
    protected void CarregarDados() {
        this.tabela.add(new Aluno(1, LocalDate.now(), "Mateus", LocalDate.of(1994, 6, 5), 1, "matt", "matt123"));
        this.tabela.add(new Aluno(2, LocalDate.now(), "Lucas", LocalDate.of(1993, 6, 5), 2, "123455", "987653"));
        this.tabela.add(new Aluno(3, LocalDate.now(), "Pedro", LocalDate.of(1994, 7, 5), 3, "123454", "987652"));
        this.tabela.add(new Aluno(4, LocalDate.now(), "Tiago", LocalDate.of(1994, 3, 5), 4, "123453", "987651"));
        this.tabela.add(new Aluno(5, LocalDate.now(), "João", LocalDate.of(1995, 2, 25), 5, "123452", "987658"));
    }        

    public AlunoFakeDB(){
        super();
    }
}