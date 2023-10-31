package uniderp.poo.escola.dominio;
import java.time.LocalDate;
import uniderp.poo.escola.dominio.BaseDadosComuns;


public abstract class BasePessoa extends BaseDadosComuns implements IImpressao  {

    protected String nome;
    protected LocalDate dataNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public BasePessoa(int codigo, LocalDate dataInsercao, String nome, LocalDate dataNascimento) {
        super(codigo, dataInsercao);
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
}
