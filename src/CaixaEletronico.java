import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 1000.0; // saldo inicial fictício
        int opcao;

        do {
            System.out.println("\n=== CAIXA ELETRÔNICO ===");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("0 - Encerrar");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual é: R$ " + saldo);
                    break;
                case 2:
                    System.out.print("Digite o valor para saque: ");
                    double saque = sc.nextDouble();
                    if (saque > 0 && saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saque realizado. Novo saldo: R$ " + saldo);
                    } else {
                        System.out.println("Saque inválido. Verifique o valor ou saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o valor para depósito: ");
                    double deposito = sc.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito realizado. Novo saldo: R$ " + saldo);
                    } else {
                        System.out.println("Depósito inválido.");
                    }
                    break;
                case 0:
                    System.out.println("Encerrando o Caixa Eletrônico...");
                    System.exit(0); // aqui o programa encerra de vez
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (true); // loop infinito até o usuário escolher sair
    }
}
