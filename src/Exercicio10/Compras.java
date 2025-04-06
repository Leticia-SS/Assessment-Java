package Exercicio10;

public class Compras {
    private String Produto;
    private int Quantidade;
    private double Preco;

    public Compras(String produto, int quantidade, double preco){
        this.Preco = preco;
        this.Produto = produto;
        this.Quantidade = quantidade;
    }

    public String exibirCompras(){
        return "Produto: " + Produto + " | Preço: " + Preco + " | Quantidade: " + Quantidade + "\n";
    }
}
