package io.github.lsmcodes.contabancaria;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.lsmcodes.contabancaria.service.ContaService;

@SpringBootApplication
public class ContaBancariaApplication {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		SpringApplication.run(ContaBancariaApplication.class, args);

		boolean mostrarMenu = true;
        
                while (mostrarMenu) {
                        System.out.println("\n1 - Criar conta");
                        System.out.println("2 - Fazer depósito");
                        System.out.println("3 - Fazer saque");
                        System.out.println("4 - Encerrar programa");
        
                        Integer opcao = Integer.parseInt(scanner.nextLine());
        
                        switch (opcao) {
                                case 1:
                                        ContaService.criarConta();
                                        break;
                                case 2:
                                        ContaService.fazerDeposito();
                                        break;
                                case 3:
                                        ContaService.fazerSaque();
                                        break;
                                case 4:
                                        mostrarMenu = false;
                                        break;
                        }
		}

	}

}