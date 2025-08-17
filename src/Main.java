import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro, e eu irei te mostrar a soma dos mumeros pares até ele: ");
        int entrada = sc.nextInt();

        int soma = 0;
        for (int i = 0; i <= entrada; i++) {
            if ( i % 2  ==  0 ) {
                soma += i ;
            }
        }
        System.out.printf("A soma dos números pares até %d é : %d %n", entrada, soma);

        sc.close();
    }
}
