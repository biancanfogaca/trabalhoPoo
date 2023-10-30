import java.util.Date;
public class BasePessoa {
    private String nome;
    private Date dataNascimento;
    private String nomeUsuario;
    private String senha;

    // Construtor e métodos comuns

    // Getters e Setters
    // ...
}

public class Professor extends BasePessoa {
    private int codigo;
    private String cargo;

    // Outros atributos e métodos específicos de Professor
    // ...
}

public class Aluno extends BasePessoa {
    private int codigo;
    private int periodo;

    // Outros atributos e métodos específicos de Aluno
    // ...
}
