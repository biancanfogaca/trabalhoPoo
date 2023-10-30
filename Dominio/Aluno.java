import java.util.Date;

public class Aluno {
    private int codigo;
    private String nome;
    private Date dataNascimento;
    private int periodo;
    private String nomeUsuario;
    private String senha;

    public Aluno(int codigo, String nome, Date dataNascimento, int periodo, String nomeUsuario, String senha) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.periodo = periodo;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    // Getters e Setters
    // ...
}
