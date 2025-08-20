import java.util.ArrayList;
import java.util.Scanner;

public class Pessoa {
    private String nome;
    private int anoNascimento;
    private double altura;

    public Pessoa(String nome, int anoNascimento, double altura) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
    }

    public void apresentar() {
        System.out.println("\n--- DADOS DA PESSOA ---");
        System.out.println("Nome: " + nome);
        System.out.println("Ano de Nascimento: " + anoNascimento);
        System.out.printf("Altura: %.2f m\n", altura);
    }

    public int calcularIdade(int anoAtual) {
        return anoAtual - anoNascimento;
    }

    public static void menuPessoa() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n=== MENU PESSOA ===");
            System.out.println("1 - Criar nova pessoa");
            System.out.println("2 - Apresentar todas as pessoas");
            System.out.println("3 - Calcular idade de uma pessoa");
            System.out.println("4 - Alterar dados de uma pessoa");
            System.out.println("5 - Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");

            if (sc.hasNextInt()) {
                opcao = sc.nextInt();
            } else {
                System.out.println("⚠ Opção inválida!");
                sc.next();
                opcao = 0;
            }

            switch(opcao) {
                case 1:
                    // Criar nova pessoa
                    sc.nextLine(); // limpar buffer
                    System.out.print("Digite o nome: ");
                    String nome = sc.nextLine();

                    int ano = 0;
                    boolean anoValido = false;
                    while (!anoValido) {
                        System.out.print("Digite o ano de nascimento: ");
                        if (sc.hasNextInt()) {
                            ano = sc.nextInt();
                            anoValido = true;
                        } else {
                            System.out.println("⚠ Valor inválido.");
                            sc.next();
                        }
                    }

                    double altura = 0;
                    boolean alturaValida = false;
                    while (!alturaValida) {
                        System.out.print("Digite a altura (ex: 1.75 ou 1,75): ");
                        String input = sc.next();
                        input = input.replace(',', '.');
                        try {
                            altura = Double.parseDouble(input);
                            alturaValida = true;
                        } catch (NumberFormatException e) {
                            System.out.println("⚠ Valor inválido.");
                        }
                    }

                    listaPessoas.add(new Pessoa(nome, ano, altura));
                    System.out.println("✅ Pessoa criada com sucesso!");
                    break;

                case 2:
                    // Apresentar todas as pessoas
                    if (listaPessoas.isEmpty()) {
                        System.out.println("⚠ Nenhuma pessoa cadastrada.");
                    } else {
                        for (int i = 0; i < listaPessoas.size(); i++) {
                            System.out.println("\nPessoa " + (i + 1));
                            listaPessoas.get(i).apresentar();
                        }
                    }
                    break;

                case 3:
                    // Calcular idade
                    if (listaPessoas.isEmpty()) {
                        System.out.println("⚠ Nenhuma pessoa cadastrada.");
                        break;
                    }
                    System.out.print("Digite o número da pessoa para calcular idade: ");
                    int idx = sc.nextInt() - 1;
                    if (idx >= 0 && idx < listaPessoas.size()) {
                        System.out.println("Idade: " + listaPessoas.get(idx).calcularIdade(2025) + " anos");
                    } else {
                        System.out.println("⚠ Pessoa não encontrada.");
                    }
                    break;

                case 4:
                    // Alterar dados
                    if (listaPessoas.isEmpty()) {
                        System.out.println("⚠ Nenhuma pessoa cadastrada.");
                        break;
                    }
                    System.out.print("Digite o número da pessoa para alterar: ");
                    int idxAlterar = sc.nextInt() - 1;
                    if (idxAlterar >= 0 && idxAlterar < listaPessoas.size()) {
                        sc.nextLine(); // limpar buffer
                        Pessoa p = listaPessoas.get(idxAlterar);
                        System.out.print("Digite o novo nome: ");
                        p.nome = sc.nextLine();

                        int novoAno = 0;
                        boolean anoNovoValido = false;
                        while (!anoNovoValido) {
                            System.out.print("Digite o novo ano de nascimento: ");
                            if (sc.hasNextInt()) {
                                novoAno = sc.nextInt();
                                anoNovoValido = true;
                            } else {
                                System.out.println("⚠ Valor inválido.");
                                sc.next();
                            }
                        }
                        p.anoNascimento = novoAno;

                        double novaAltura = 0;
                        boolean alturaNovaValida = false;
                        while (!alturaNovaValida) {
                            System.out.print("Digite a nova altura (ex: 1.75 ou 1,75): ");
                            String inputAlt = sc.next();
                            inputAlt = inputAlt.replace(',', '.');
                            try {
                                novaAltura = Double.parseDouble(inputAlt);
                                alturaNovaValida = true;
                            } catch (NumberFormatException e) {
                                System.out.println("⚠ Valor inválido.");
                            }
                        }
                        p.altura = novaAltura;
                        System.out.println("✅ Dados atualizados com sucesso!");
                    } else {
                        System.out.println("⚠ Pessoa não encontrada.");
                    }
                    break;

                case 5:
                    System.out.println("Voltando ao menu principal...");
                    break;

                default:
                    if (opcao != 0) System.out.println("⚠ Opção inválida!");
            }

        } while(opcao != 5);
        // sc.close(); // não fechamos se a Main ainda vai usar
    }
}
