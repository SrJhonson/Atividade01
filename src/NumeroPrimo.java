import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int numero = scanner.nextInt();

        if(Primo(numero)) {
            System.out.println(numero + " é um numero primo");
        }else {
            System.out.println((numero + " não é um numero primo"));
        }
    }
    public static boolean Primo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}

