import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro (ou negarivo para sair), e eu irei te mostrar a soma dos mumeros pares até ele: ");
        int entrada = sc.nextInt();

        int soma = 0;
        int quantidade = 0;
        int media = 0;
        while (entrada >=0 ) {
            if (entrada > 0 ) {
            soma += entrada;
            quantidade ++;
        };
            media = soma / quantidade;
            System.out.println("Digite outro numero: ");
            entrada = sc.nextInt();

        };

        System.out.printf("Você digitou %d numeros positivos %n", quantidade);
        System.out.printf("A soma deles é %d %n", soma);
        System.out.printf("A media desses numeros é %d %n", media);

        sc.close();
    }
}
