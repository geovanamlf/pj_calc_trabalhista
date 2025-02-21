package src.TrabalhistaCalc;

import java.util.Scanner;

public class Usuario {
    // Atributos do usuário
    private String nome;
    private int idade;
    private String tipoVinculo; // PJ ou CLT
    private boolean trabalhaComPericulosidade; // Se o usuario trabalha com periculosidade
    private boolean temFilhos;
    private double salario;

    // Construtor
    public Usuario(String nome, int idade, String tipoVinculo, boolean trabalhaComPericulosidade, boolean temFilhos, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.tipoVinculo = tipoVinculo;
        this.trabalhaComPericulosidade = trabalhaComPericulosidade;
        this.temFilhos = temFilhos;
        this.salario = salario;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método para calcular o INSS
    public double calcularINSS() {
        if (salario <= 1320.00) {
            return salario * 0.075;
        } else if (salario <= 2571.29) {
            return salario * 0.09;
        } else if (salario <= 3856.94) {
            return salario * 0.12;
        } else if (salario <= 7507.49) {
            return salario * 0.14;
        } else {
            return 7507.49 * 0.14; // Teto máximo
        }
    }

    // Métodos para exibir os dados do usuário
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Tipo de Vínculo: " + tipoVinculo);
        System.out.println("Trabalha com Periculosidade: " + (trabalhaComPericulosidade ? "Sim" : "Não"));
        System.out.println("Tem filhos: " + (temFilhos ? "Sim" : "Não"));
        System.out.printf("Salário: R$ %.2f%n", salario);
        System.out.printf("Desconto INSS: R$ %.2f%n", calcularINSS());
    }

    // Método para criar o usuário a partir do console
    public static Usuario criarUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();  // Consumir a quebra de linha após o número

        System.out.print("Digite o tipo de vínculo (PJ ou CLT): ");
        String tipoVinculo = scanner.nextLine();

        System.out.print("Você trabalha com periculosidade? (true/false): ");
        boolean trabalhaComPericulosidade = scanner.nextBoolean();

        System.out.print("Você tem filhos? (true/false): ");
        boolean temFilhos = scanner.nextBoolean();

        System.out.print("Digite o valor do seu salário: ");
        double salario = scanner.nextDouble();

        // Criando e retornando o objeto Usuario
        return new Usuario(nome, idade, tipoVinculo, trabalhaComPericulosidade, temFilhos, salario);
    }
}