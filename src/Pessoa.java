import java.util.Scanner;

public class Pessoa {
    private String nome;
    private int anoNascimento;
    private double altura;

    // Construtor
    public Pessoa(String nome, int anoNascimento, double altura) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
    }

    // Método para apresentar os dados
    public void apresentar() {
        System.out.println("\n--- DADOS DA PESSOA ---");
        System.out.println("Nome: " + nome);
        System.out.println("Ano de Nascimento: " + anoNascimento);
        System.out.printf("Altura: %.2f m\n", altura);
    }

    // Método para calcular idade
    public int calcularIdade(int anoAtual) {
        return anoAtual - anoNascimento;
    }

    // Menu interativo completo
    public static void menuPessoa() {
        Scanner sc = new Scanner(System.in);

        // Entrada inicial do usuário
        System.out.print("Digite o nome da pessoa: ");
        String nome = sc.nextLine();

        int anoNascimento = 0;
        boolean anoValido = false;
        while (!anoValido) {
            System.out.print("Digite o ano de nascimento: ");
            if (sc.hasNextInt()) {
                anoNascimento = sc.nextInt();
                anoValido = true;
            } else {
                System.out.println("⚠ Valor inválido. Digite um número inteiro.");
                sc.next(); // descarta entrada inválida
            }
        }

        double altura = 0;
        boolean alturaValida = false;
        while (!alturaValida) {
            System.out.print("Digite a altura (ex: 1.75 ou 1,75): ");
            String input = sc.next();
            input = input.replace(',', '.');
            try {
                altura = Double.parseDouble(input);
                alturaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("⚠ Valor inválido. Tente novamente.");
            }
        }

        Pessoa pessoa = new Pessoa(nome, anoNascimento, altura);

        // Menu do projeto
        int opcao;
        do {
            System.out.println("\n=== MENU PESSOA ===");
            System.out.println("1 - Apresentar dados");
            System.out.println("2 - Calcular idade");
            System.out.println("3 - Alterar dados");
            System.out.println("4 - Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");

            if (sc.hasNextInt()) {
                opcao = sc.nextInt();
            } else {
                System.out.println("⚠ Opção inválida!");
                sc.next(); // descarta entrada inválida
                opcao = 0; // força repetir o menu
            }

            switch(opcao) {
                case 1:
                    pessoa.apresentar();
                    break;
                case 2:
                    System.out.println("Idade: " + pessoa.calcularIdade(2025) + " anos");
                    break;
                case 3:
                    sc.nextLine(); // limpar buffer

                    // Alterar nome
                    System.out.print("Digite o novo nome: ");
                    pessoa.nome = sc.nextLine();

                    // Alterar ano de nascimento
                    int novoAno = 0;
                    boolean anoNovoValido = false;
                    while (!anoNovoValido) {
                        System.out.print("Digite o novo ano de nascimento: ");
                        if (sc.hasNextInt()) {
                            novoAno = sc.nextInt();
                            anoNovoValido = true;
                        } else {
                            System.out.println("⚠ Valor inválido. Digite um número inteiro.");
                            sc.next();
                        }
                    }
                    pessoa.anoNascimento = novoAno;

                    // Alterar altura
                    double novaAltura = 0;
                    boolean alturaNovaValida = false;
                    while (!alturaNovaValida) {
                        System.out.print("Digite a nova altura (ex: 1.75 ou 1,75): ");
                        String inputAlt = sc.next();
                        inputAlt = inputAlt.replace(',', '.');
                        try {
                            novaAltura = Double.parseDouble(inputAlt);
                            alturaNovaValida = true;
                        } catch (NumberFormatException e) {
                            System.out.println("⚠ Valor inválido. Tente novamente.");
                        }
                    }
                    pessoa.altura = novaAltura;
                    System.out.println("✅ Dados atualizados com sucesso!");
                    break;
                case 4:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    if (opcao != 0) System.out.println("⚠ Opção inválida!");
            }

        } while(opcao != 4);
        // sc.close(); // não fechamos se a Main ainda vai usar
    }
}
