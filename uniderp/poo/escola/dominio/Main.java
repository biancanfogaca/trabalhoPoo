package uniderp.poo.escola.dominio;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Professor");
            System.out.println("2. Aluno");
            System.out.println("3. Encerramento");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    menuProfessor();
                    break;
                case 2:
                    menuAluno();
                    break;
                case 3:
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void menuProfessor() {
        int continuar = 99;
    do {
        System.out.println("Menu do Professor:");
        System.out.println("1. Lista de turmas deste professor");
        System.out.println("2. Lista de alunos da turma selecionada");
        System.out.println("3. Notas do aluno selecionado");
        int opcao = this.scan.nextInt();
        switch (opcao) {
            case 1:
                this.ExecutarOpcao1();
                break;
            case 2:
                this.ExecutarOpcao2();
                break;
            case 3:
                this.ExecutarOpcao3();
                break;
            case 4:
                this.ExecutarOpcao4();
                break;
            case 5:
                this.ExecutarOpcao5();
                break;
            case 9:
                this.ExecutarOpcao5();
                break;
        }
    } while(continuar != 9);
   
}
    }

    public static void menuAluno() {
        int continuar = 99;
    do {
        System.out.println("Menu do Aluno:");
        System.out.println("1. Turma que o aluno pertence");
        System.out.println("2. Exibir informações desta turma");
        System.out.println("3. Disciplinas que o aluno cursa");
        System.out.println("4. Notas do aluno na disciplina selecionada");
        System.out.println("5. Notas de trabalho do aluno, na disciplina selecionada");
        System.out.println("6. Rendimento Escolar do aluno");
        int opcao = this.scan.nextInt();
        switch (opcao) {
            case 1:
                this.ExecutarOpcao1();
                break;
            case 2:
                this.ExecutarOpcao2();
                break;
            case 3:
                this.ExecutarOpcao3();
                break;
            case 4:
                this.ExecutarOpcao4();
                break;
            case 5:
                this.ExecutarOpcao5();
                break;
            case 9:
                this.ExecutarOpcao5();
                break;
        }
    } while(continuar != 9);
   
    }

    private void ExecutarOpcao1(){

    }

    private void ExecutarOpcao1(){
        
    }

    private void ExecutarOpcao1(){
        
    }

    private void ExecutarOpcao1(){
        
    }
    private void ExecutarOpcao1(){
        
    }
    private void ExecutarOpcao1(){
        
    }
}
