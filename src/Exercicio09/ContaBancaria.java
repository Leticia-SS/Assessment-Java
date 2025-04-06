package Exercicio09;

public class ContaBancaria {
    private String Titular;
    private double Saldo;

    public ContaBancaria(String name){
        this.Titular = name;
    }
    public String depositar(double value){
        Saldo += value;
        return "Depósito realizado com sucesso";
    }
    public String sacar(double value){
        if(value <= Saldo) {
            Saldo -= value;
            return "Saque reaalizado com sucesso";
        } else{
            return "Saldo insuficiente para saque";
        }
    }
    public void exibirSaldo() {
        System.out.println("Saldo Atual: R$" + String.format("%.2f", Saldo));
        System.out.println("\n");
    }
}
