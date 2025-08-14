//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite seu nome");
    String nome = sc.nextLine();

    System.out.println("Digite sua idade");
    int idade = sc.nextInt();


    System.out.println("Olá " + nome + "! Você tem " + idade + "anos!" );
    }
}