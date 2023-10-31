package uniderp.poo.escola.dominio;
import java.time.LocalDate;
import uniderp.poo.escola.dominio.BasePessoa;
 
public class Aluno extends BasePessoa implements IImpressao {
    private int periodo;

    public Aluno(int codigo, LocalDate dataInsercao, String nome, LocalDate dataNascimento, int periodo, String nomeUsuario, String senha) {
        super(codigo, dataInsercao, nome, dataNascimento); 
        this.periodo = periodo;
    }

    public int getPeriodo() {
        return periodo;
    }

    @Override
public void Imprimir() {
    System.out.println("Código: " + getCodigo());
    System.out.println("Data de Inserção: " + getDataInsercao());
    System.out.println("Nome: " + getNome());
    System.out.println("Data de Nascimento: " + getDataNascimento());
    System.out.println("Período: " + getPeriodo());
    System.out.println("Nome de Usuário: " + getNomeUsuario());
    System.out.println("Senha: " + getSenha());
}

}
