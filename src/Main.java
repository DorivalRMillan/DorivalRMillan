import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String SENHA_CORRETA = "1234";

        int tentativas = 0;
        while (tentativas < 3) {
            System.out.print("Digite a senha (não deixe em branco): ");
            String tentativa = sc.nextLine().trim();

            if (tentativa.isEmpty()) {
                System.out.println("Senha vazia não é válida.");
            } else if (tentativa.equals(SENHA_CORRETA)) {
                System.out.println("Acesso permitido!");
                break; // encerra imediatamente
            } else {
                System.out.println("Senha incorreta.");
            }

            tentativas++; // só chega aqui se não tiver acertado
        }

        if (tentativas >= 3) {
            System.out.println("Número de tentativas excedidas. Você perdeu o acesso!");
        }

        sc.close();
    }
}
