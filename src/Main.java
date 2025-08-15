import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Quanto você ganha por hora (R$): ");
        float valorHora = sc.nextFloat();

        System.out.print("Quantas horas você trabalha por mês: ");
        float horasTrabalhadas = sc.nextFloat();

        float salarioMensal = valorHora * horasTrabalhadas;

        System.out.printf(
                "Olá %s!%nVocê recebe R$%.2f por hora.%nSeu salário mensal é R$%.2f.%n",
                nome, valorHora, salarioMensal
        );

        sc.close();
    }
}
