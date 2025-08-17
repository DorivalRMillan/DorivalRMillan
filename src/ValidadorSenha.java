import java.util.Scanner;

public class ValidadorSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String CODIGO_CORRETO = "1234"; // código fixo para validar
        int tentativas = 0;

        while (tentativas < 3) {
            System.out.print("Digite o código de acesso (não deixe em branco): ");
            String tentativa = sc.nextLine().trim();

            if (tentativa.isEmpty()) {
                System.out.println("Código vazio não é válido. Tente novamente.");
                tentativas++; // conta como tentativa
                continue;
            }

            if (tentativa.equals(CODIGO_CORRETO)) {
                System.out.println("Acesso permitido!");
                break;
            } else {
                System.out.println("Código incorreto. Tente novamente.");
            }

            tentativas++;
        }

        if (tentativas >= 3) {
            System.out.println("Número de tentativas excedido. Acesso bloqueado!");
        }
    }
}
