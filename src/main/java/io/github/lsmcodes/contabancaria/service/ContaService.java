package io.github.lsmcodes.contabancaria.service;

import java.util.Scanner;

import io.github.lsmcodes.contabancaria.model.Conta;

public class ContaService {

        private static Scanner scanner = new Scanner(System.in);
        private static Conta conta;

        public static void criarConta() {

                conta = new Conta();

                System.out.println("\nPor favor, forneça alguns dados para a criação da sua conta:");
                System.out.println("\nDigite o número da conta:");
                conta.setNumero(Integer.parseInt(scanner.nextLine()));

                System.out.println("\nDigite o número da agência:");
                conta.setAgencia(scanner.nextLine());

                System.out.println("\nDigite o seu nome:");
                conta.setNomeCliente(scanner.nextLine());

                System.out.println("\nDigite o valor do depósito inicial:");
                conta.setSaldo(Double.parseDouble(scanner.nextLine()));

                System.out.println(String.format(
                                "\nOlá %s, obrigado(a) por criar uma conta em nosso banco! Sua agência é %s, conta %d com saldo de R$ %.2f reais.",
                                conta.getNomeCliente(), conta.getAgencia(), conta.getNumero(), conta.getSaldo()));

        }

        public static void fazerDeposito() {

                System.out.println("\nPor favor, digite o valor do depósito:");
                Double deposito = 0.0;

                deposito = Double.parseDouble(scanner.nextLine());
                conta.setSaldo(conta.getSaldo() + deposito);

                System.out.println(String.format("\nO seu saldo agora é de R$ %.2f reais.", conta.getSaldo()));

        }

        public static void fazerSaque() {

                System.out.println("\nPor favor, digite o valor do saque:");
                Double saque = 0.0;

                saque = Double.parseDouble(scanner.nextLine());
                if (conta.getSaldo() >= saque)
                        conta.setSaldo(conta.getSaldo() - saque);

                System.out.println(String.format("\nO seu saldo agora é de R$ %.2f reais.", conta.getSaldo()));

        }

}