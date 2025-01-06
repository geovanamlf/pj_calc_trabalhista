package src.TrabalhistaCalc;

import java.util.Scanner;

public class Usuario {
    // Atributos do usuário
    private String nome;
    private int idade;
    private String tipoVinculo; // PJ ou CLT
    private boolean trabalhaComPericulosidade; // Se o usuario trabalha com periculosidade
    private boolean temFilhos;

    // Construtor
    public Usuario (String nome, int idade, String tipoVinculo, boolean trabalhaComPericulosidade, boolean temFilhos) {
        this.nome = nome;
        this.idade = idade;
        this.tipoVinculo = tipoVinculo;
        this.trabalhaComPericulosidade = trabalhaComPericulosidade;
        this.temFilhos = temFilhos;
    }

    // Métodos de acesso (getters e setters)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTipoVinculo() {
        return tipoVinculo;
    }

    public void setTipoVinculo(String tipoVinculo) {
        this.tipoVinculo = tipoVinculo;
    }

    public boolean isTrabalhaComPericulosidade() {
        return trabalhaComPericulosidade;
    }

    public void setTrabalhaComPericulosidade(boolean trabalhaComPericulosidade) {
        this.trabalhaComPericulosidade = trabalhaComPericulosidade;
    }

    public boolean isTemFilhos() {
        return temFilhos;
    }

    public void setTemFilhos(boolean temFilhos) {
        this.temFilhos = temFilhos;
    }

    // Métodos para exibir os dados do usuário
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Tipo de Vínculo: " + tipoVinculo);
        System.out.println("Trabalha com Periculosidade: " + (trabalhaComPericulosidade ? "Sim" : "Não"));
        System.out.println("Tem filhos: " + (temFilhos ? "Sim" : "Não"));
    }

    // Métodos para exibir os dados do usuário
    public static Usuario criarUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();  // Consumir a nova linha após a entrada do número

        System.out.print("Digite o tipo de vínculo (PJ ou CLT): ");
        String tipoVinculo = scanner.nextLine();

        System.out.print("Você trabalha com periculosidade? (true/false): ");
        boolean trabalhaComPericulosidade = scanner.nextBoolean();

        System.out.print("Você tem filhos? (true/false): ");
        boolean temFilhos = scanner.nextBoolean();

        // Criando o objeto Usuario
        return new Usuario(nome, idade, tipoVinculo, trabalhaComPericulosidade, temFilhos);
    }
}
