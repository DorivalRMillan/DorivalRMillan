import java.util.Scanner;

public class Pessoa {
    // Atributos
    private String nome;
    private int anoNascimento;
    private double altura;

    // Construtor
    public Pessoa(String nome, int anoNascimento, double altura) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
    }

    // Método para apresentar os dados da pessoa
    public void apresentar() {
        System.out.println("\n--- DADOS DA PESSOA ---");
        System.out.println("Nome: " + nome);
        System.out.println("Ano de Nascimento: " + anoNascimento);
        System.out.println("Altura: " + altura + "m");
    }

    // Método para calcular a idade
    public int calcularIdade(int anoAtual) {
        return anoAtual - anoNascimento;
    }

    // Menu interativo do Projeto Pessoa
    public static void menuPessoa() {
        Scanner sc = new Scanner(System.in);

        // Criando um objeto Pessoa (você pode alterar os dados ou receber do usuário)
        Pessoa pessoa = new Pessoa("Dorival", 1995, 1.75);

        int opcao;
        do {
            System.out.println("\n=== MENU PESSOA ===");
            System.out.println("1 - Apresentar dados");
            System.out.println("2 - Calcular idade");
            System.out.println("3 - Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    pessoa.apresentar();
                    break;
                case 2:
                    System.out.println("Idade: " + pessoa.calcularIdade(2025) + " anos");
                    break;
                case 3:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("⚠ Opção inválida!");
            }
        } while(opcao != 3);

        // Se quiser, pode fechar o scanner aqui, mas cuidado com Scanner compartilhado
        // sc.close(); // não fechamos se a Main ainda vai usar Scanner
    }
}
