package VendaAlimentos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Venda[] vendas = new Venda[10];

        double valorTotalVendido = 0;
        int quantidadeTotalItens = 0;
        Venda maiorVenda = null;
        Venda menorVenda = null;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o código do produto: ");
            String codigoProduto = scanner.next();

            System.out.print("Digite o valor unitário: ");
            double valorUnitario = scanner.nextDouble();

            System.out.print("Digite a quantidade: ");
            int quantidade = scanner.nextInt();

            vendas[i] = new Venda(codigoProduto, valorUnitario, quantidade);
            double valorTotal = vendas[i].calcularValorTotal();
            valorTotalVendido += valorTotal;
            quantidadeTotalItens += quantidade;

            if (maiorVenda == null || valorTotal > maiorVenda.calcularValorTotal()) {
                maiorVenda = vendas[i];
            }

            if (menorVenda == null || valorTotal < menorVenda.calcularValorTotal()) {
                menorVenda = vendas[i];
            }

            System.out.printf("Valor total da venda: %.2f\n", valorTotal);
        }

        double valorMedioVendido = valorTotalVendido / 10;

        System.out.println("##########################");
        System.out.printf("Valor médio vendido: %.2f\n", valorMedioVendido);
        System.out.printf("Produto com maior venda: Código: %s, Quantidade: %d, Valor Total: %.2f\n",
                maiorVenda.codigoProduto, maiorVenda.quantidade, maiorVenda.calcularValorTotal());
        System.out.printf("Produto com menor venda: Código: %s, Quantidade: %d, Valor Total: %.2f\n",
                menorVenda.codigoProduto, menorVenda.quantidade, menorVenda.calcularValorTotal());
        System.out.printf("Valor Total Vendido: %.2f\n", valorTotalVendido);
        System.out.printf("Quantidade Total de Itens Vendidos: %d\n", quantidadeTotalItens);
        System.out.println("##########################");
    }
}
