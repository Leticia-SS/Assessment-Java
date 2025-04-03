package Exercicio03;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu salário anual: ");
        double salario = input.nextDouble();

        ImpostoDeRenda imposto = new ImpostoDeRenda();

        System.out.printf(imposto.calcularImposto(salario));
    }
}
