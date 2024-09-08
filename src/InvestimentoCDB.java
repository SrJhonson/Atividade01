import java.util.Scanner;

public class InvestimentoCDB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a taxa Selic (%): ");
        double taxaSelic = scanner.nextDouble() / 100;

        System.out.print("Digite o capital investido: ");
        double capital = scanner.nextDouble();

        calcularRendimento("CDB Banco Pague Mais", capital, taxaSelic, 0.85, 0.10, 0, 0);
        calcularRendimento("CDB Fura Bolso", capital, taxaSelic, 0.93, 0.01, 0.06, 0.01);
    }

    public static void calcularRendimento(String nomeInvestimento, double capital, double taxaSelic, double percentualSelic, double taxaAdmRendimento, double impostoRendimento, double taxaAdmFixa) {
        double capitalInicial = capital;
        double rendimentoTotal = 0;
        double descontos = 0;

        System.out.println("##########################");
        System.out.println("Investimento: " + nomeInvestimento);
        System.out.println("##########################");
        System.out.printf("Taxa Selic: %.2f%%\n", taxaSelic * 100);
        System.out.printf("Capital investido: %.2f\n", capital);

        for (int mes = 1; mes <= 12; mes++) {
            double rendimento = capital * (percentualSelic * taxaSelic);
            double taxaAdm = rendimento * taxaAdmRendimento;
            double imposto = rendimento * impostoRendimento;
            double taxaFixa = capitalInicial * taxaAdmFixa;

            rendimentoTotal += rendimento;
            descontos += (taxaAdm + imposto + taxaFixa);
            capital += (rendimento - taxaAdm - imposto - taxaFixa);

            System.out.printf("Mês %d\tCapital: %.2f\tRendimento: %.2f\tTotal: %.2f\n", mes, capital, rendimento, capital);
        }

        double rendimentoLiquido = rendimentoTotal - descontos;

        System.out.println("##########################");
        System.out.printf("Rendimento Total: %.2f\n", rendimentoTotal);
        System.out.printf("Descontos: %.2f\n", descontos);
        System.out.printf("Rendimento Líquido: %.2f\n", rendimentoLiquido);
        System.out.println("##########################");
    }
}
