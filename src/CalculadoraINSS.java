import java.util.Scanner;

public class CalculadoraINSS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("##########################");
        System.out.println("CALCULADORA DE INSS");
        System.out.println("##########################");

        System.out.print("Digite o salário bruto: ");
        double salarioBruto = scanner.nextDouble();

        double aliquota = 0;
        double deducao = 0;

        if (salarioBruto <= 1212.00) {
            aliquota = 7.5;
            deducao = 0.00;
        } else if (salarioBruto <= 2427.35) {
            aliquota = 9.0;
            deducao = 18.18;
        } else if (salarioBruto <= 3641.03) {
            aliquota = 12.0;
            deducao = 91.00;
        } else if (salarioBruto <= 7087.22) {
            aliquota = 14.0;
            deducao = 163.82;
        } else {
            aliquota = 14.0;
            deducao = 163.82;
        }

        double descontoINSS = (salarioBruto * (aliquota / 100)) - deducao;
        double salarioLiquido = salarioBruto - descontoINSS;

        System.out.printf("Salário Bruto ....: %.2f\n", salarioBruto);
        System.out.printf("Alíquota INSS (%%).: %.1f\n", aliquota);
        System.out.printf("Desconto INSS …..: %.2f\n", descontoINSS);
        System.out.printf("Salário Líquido ..: %.2f\n", salarioLiquido);
        System.out.println("##########################");
    }
}
