package src.TrabalhistaCalc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar o usuário
        Usuario usuario = Usuario.criarUsuario();

        int opcao;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Exibir Dados do Usuário");
            System.out.println("2 - Calcular INSS");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    usuario.exibirDados();
                    break;
                case 2:
                    System.out.println("Desconto INSS: R$ " + usuario.calcularINSS());
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 3);

        // Exibir os dados do usuário
        usuario.exibirDados();
    }
}
