package Alunos;

public class Main {
    public static void main(String[] args) {
        // a. Crie uma variável a1 do tipo CalculosAmostra.Aluno que receba a instância de CalculosAmostra.Aluno
        // b. Atribua valores arbitrários
        Aluno a1 = new Aluno("João", 7.5, 8.0);

        // c. Mostre os valores
        System.out.println("Valores de a1:");
        a1.mostrarValores();

        // d. Crie uma variável a2 que receba a1
        Aluno a2 = a1;

        // e. Altere os valores da p1 e p2 na variável a2 e mostre os valores dos atributos de a1 e a2
        a2.p1 = 9.0;
        a2.p2 = 9.5;

        System.out.println("\nValores de a1 após alteração em a2:");
        a1.mostrarValores();

        System.out.println("\nValores de a2:");
        a2.mostrarValores();

        // f. Os valores são diferentes? Explique.
        System.out.println("\nExplicação:");
        System.out.println("Os valores de a1 e a2 são os mesmos porque a2 é uma referência para o mesmo objeto que a1.");
        System.out.println("Quando alteramos os valores de p1 e p2 em a2, estamos alterando o mesmo objeto referenciado por a1.");
    }
}
