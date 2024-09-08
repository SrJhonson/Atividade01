import java.util.Scanner;

public class ContarNegativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o números de valores a serem inseridos: ");
        int n = scanner.nextInt();
        int numNegativo = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            int valor = scanner.nextInt();

            if (valor < 0){
                numNegativo++;
            }
        }
        System.out.println("A quantiade de numeros negativos foi: "+ numNegativo);
    }
}
