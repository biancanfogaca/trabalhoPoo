import java.util.Date;

public class Professor {
    private int codigo;
    private String nome;
    private String cargo;
    private Date dataNascimento;
    private String nomeUsuario;
    private String senha;

    public Professor(int codigo, String nome, String cargo, Date dataNascimento, String nomeUsuario, String senha) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargo = cargo;
        this.dataNascimento = dataNascimento;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    // Getters e Setters
    // ...

    @Override
    public String toString() {
        return "Professor [codigo=" + codigo + ", nome=" + nome + "]";
    }
}
