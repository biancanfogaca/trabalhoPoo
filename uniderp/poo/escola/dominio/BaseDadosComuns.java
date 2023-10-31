package uniderp.poo.escola.dominio;
import java.time.LocalDate;
import uniderp.poo.escola.dominio.BaseIdentificador;

public abstract class BaseDadosComuns extends BaseIdentificador {
    protected String nomeUsuario;
    protected String senha;
    protected LocalDate dataInsercao;

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getDataInsercao() {
        return dataInsercao;
    }

    public void setDataInsercao(LocalDate dataInsercao) {
        this.dataInsercao = dataInsercao;
    }


    public BaseDadosComuns(int codigo, String nomeUsuario, String senha, LocalDate dataInsercao) {
        super(codigo);
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.dataInsercao = dataInsercao;
    }
}
