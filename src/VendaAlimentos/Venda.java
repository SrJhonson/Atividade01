package VendaAlimentos;

public class Venda {
    String codigoProduto;
    double valorUnitario;
    int quantidade;

    public Venda(String codigoProduto, double valorUnitario, int quantidade) {
        this.codigoProduto = codigoProduto;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }

    public double calcularValorTotal() {
        return valorUnitario * quantidade;
    }
}
