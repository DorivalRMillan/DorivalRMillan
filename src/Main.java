import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero de 1 a 10 que você deseja saber a tabuada: ");
        float tabuada = sc.nextInt();

        for (int i = 0; i < 11; i++) {
            float novaTabuada = tabuada * i;
            System.out.printf("%.2f x %d = %.2f%n", tabuada, i, novaTabuada);

        }


        sc.close();
    }
}