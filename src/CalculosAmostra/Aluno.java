package CalculosAmostra;

public class Aluno {
    String nome;
    double p1;
    double p2;

    // Construtor
    public Aluno(String nome, double p1, double p2) {
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }

    // Método para exibir os valores
    public void mostrarValores() {
        System.out.println("Nome: " + nome);
        System.out.println("P1: " + p1);
        System.out.println("P2: " + p2);
    }
}
