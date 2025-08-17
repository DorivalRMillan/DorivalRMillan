import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String SENHA_CORRETA = "1234";

        // Se você leu algum número antes desta parte, descomente a linha abaixo:
        // sc.nextLine(); // consome o Enter pendente do nextInt/nextFloat

        while (true) {
            System.out.print("Digite a senha (não deixe em branco): ");
            String tentativa = sc.nextLine().trim(); // remove espaços

            if (tentativa.isEmpty()) {
                System.out.println("Senha vazia não é válida. Tente novamente.");
                continue; // volta ao início do while
            }

            if (tentativa.equals(SENHA_CORRETA)) {
                System.out.println("Acesso permitido!");
                break; // sai do while
            } else {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        }

        sc.close();
    }
}
