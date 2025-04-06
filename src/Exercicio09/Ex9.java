package Exercicio09;

public class Ex9 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Lara Saraiva");

        System.out.println(conta.depositar(1500));
        conta.exibirSaldo();
        System.out.println(conta.sacar(150));
        conta.exibirSaldo();
        System.out.println(conta.sacar(2000));
        conta.exibirSaldo();
    }
}
