import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Qual a sua idade? ");
        float idade = sc.nextInt();

        if (idade >= 18) {
            System.out.printf("%s, você é de maior e pode entrar.%n", nome);
        } else if ( idade >= 16) {
            System.out.printf("%s, você precisa antes de uma autorização.%n", nome);
        } else {
            System.out.printf("%s, você é de menor, está proibido de entrar!.%n", nome);
        };
        sc.close();
    }
}