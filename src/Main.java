import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número decimal (pode usar vírgula ou ponto): ");
        String entrada = sc.nextLine();
        entrada = entrada.replace(",", "."); // troca vírgula por ponto
        float decimal = Float.parseFloat(entrada);

        System.out.println("Digite um número inteiro até onde a tabuada deve ir (por exemplo 8): ");
        int tabuada = sc.nextInt();

        for (int i = 0; i <= tabuada; i++) {
            float novaTabuada = decimal * i;
            System.out.printf("%.2f x %d = %.2f%n", decimal, i, novaTabuada);
        }

        sc.close();
    }
}
