package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidaEntradaUtils {

    public static int validaInputUsuarioRangeOpcoes(Scanner scanner, int min, int max) {
        while (true) {
            try {
                int opcao = scanner.nextInt();
                scanner.nextLine();
                if (opcao >= min && opcao <= max) {
                    return opcao;
                } else {
                    System.out.println("Opção inválida. Por favor, escolha uma opção entre " + min + " e " + max + ".");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro válido.");
                scanner.nextLine();
            }
        }
    }

    public static String validaInputStringNaoVazia(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            } else {
                System.out.println("Entrada inválida. Por favor, digite um valor não vazio.");
            }
        }
    }

    public static int validaInputInteger(Scanner scanner) {
        while (true) {
            try {
                int idade = scanner.nextInt();
                scanner.nextLine();
                if (idade >= 0) {
                    return idade;
                } else {
                    System.out.println("Valor informado inválido. Por favor, digite uma valor maior ou igual a 0.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro válido.");
                scanner.nextLine();
            }
        }
    }
}
