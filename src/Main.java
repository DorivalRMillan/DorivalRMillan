import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro (negativo para sair):");
        int entrada = sc.nextInt();

        int soma = 0;
        int quantidade = 0;

        while (entrada >= 0) {
            if (entrada > 0) {          // zero não entra na média
                soma += entrada;
                quantidade++;
            }
            System.out.println("Digite outro número (negativo para sair):");
            entrada = sc.nextInt();
        }

        if (quantidade > 0) {
            double media = (double) soma / quantidade; // média real (decimal)
            System.out.printf("Você digitou %d números positivos.%n", quantidade);
            System.out.printf("A soma deles é %d.%n", soma);
            System.out.printf("A média desses números é %.2f.%n", media);
        } else {
            System.out.println("Nenhum número positivo foi digitado.");
        }

        sc.close();
    }
}
