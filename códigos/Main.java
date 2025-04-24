package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Pessoa Física: Digite \"1\": | Pessoa Jurídica: Digite \"2\":");
                String input = sc.nextLine();

                if (!input.equals("1") && !input.equals("2")) {
                    throw new IllegalArgumentException("Opção inválida! Digite 1 para pessoa física ou 2 para pessoa jurídica.");
                }

                int opcao = Integer.parseInt(input);

                if (opcao == 1) {
                    System.out.println("Cadastrar cliente PF:");
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("CPF (somente números, 11 dígitos): ");
                    String cpf = sc.nextLine();

                    if (!cpf.matches("\\d{11}")) {
                        throw new IllegalArgumentException("CPF inválido! Digite exatamente 11 números sem letras ou símbolos.");
                    }

                    ClientePessoaFisica cliente = new ClientePessoaFisica(nome, cpf);
                    cliente.cadastrar();
                    cliente.exibirDados();

                } else {
                    System.out.println("Cadastrar cliente PJ:");
                    System.out.print("Nome da empresa: ");
                    String nome = sc.nextLine();

                    String cnpj;
                    while (true) {
                        System.out.print("CNPJ (somente números, 14 dígitos): ");
                        cnpj = sc.nextLine();

                        if (cnpj.matches("\\d{14}")) {
                            break;
                        } else {
                            System.out.println("CNPJ inválido! Digite exatamente 14 números sem letras ou símbolos.");
                        }
                    }

                    ClientePessoaJuridica cliente = new ClientePessoaJuridica(nome, cnpj);
                    cliente.cadastrar();
                    cliente.exibirDados();
                }

                break; 

            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
                System.out.println("Tente novamente.\n");
            }
        }

        sc.close();
    }
}
