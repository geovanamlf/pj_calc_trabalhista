package src.TrabalhistaCalc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar o usuário
        Usuario usuario = Usuario.criarUsuario();

        // Exibir os dados do usuário
        usuario.exibirDados();
    }
}
