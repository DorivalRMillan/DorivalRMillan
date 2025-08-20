import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("\n=== PORTFÓLIO JAVA ===");
            System.out.println("1 - Validador de Senha");
            System.out.println("2 - Caixa Eletrônico");
            System.out.println("3 - Projeto Pessoa");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            if (sc.hasNextInt()) {
                escolha = sc.nextInt();
            } else {
                System.out.println("⚠ Opção inválida!");
                sc.next();
                escolha = 0;
            }

            switch (escolha) {
                case 1:
                    ValidadorSenha.main(null); // chama o outro arquivo
                    break;
                case 2:
                    CaixaEletronico.main(null); // chama o outro arquivo
                    break;
                case 3:
                    Pessoa.menuPessoa(); // chama o novo menu de múltiplas pessoas
                    break;
                case 4:
                    System.out.println("Saindo do portfólio...");
                    break;
                default:
                    if (escolha != 0) System.out.println("⚠ Opção inválida! Tente novamente.");
            }
        } while (escolha != 4);

        sc.close();
    }
}
