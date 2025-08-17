import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // 1. Gerar código aleatório de 6 dígitos
        int codigoGerado = 100000 + random.nextInt(900000);
        System.out.println("Seu código de validação é: " + codigoGerado);

        // 2. Tentativas
        int tentativas = 0;
        boolean validado = false;

        while (tentativas < 3) {
            System.out.print("Digite o código de 6 dígitos: ");
            String entrada = sc.nextLine().trim();

            //Validação de tamanho
            if (entrada.length() != 6) {
                System.out.println("O código deve ter exatamente 6 dígitos.");
                tentativas++;
                continue; // volta pro começo do while
            }

            //Verificação se é número
            if (!entrada.matches("\\d+")) {
                System.out.println("O código deve conter apenas números.");
                tentativas++;
                continue;
            }

            //Comparação com o código gerado
            if (entrada.equals(String.valueOf(codigoGerado))) {
                System.out.println("Código correto! Acesso liberado.");
                validado = true;
                break;
            } else {
                System.out.println("Código incorreto.");
            }

            tentativas++;
        }

        if (!validado) {
            System.out.println("Número de tentativas excedido.");
        }

        sc.close();
    }
}
