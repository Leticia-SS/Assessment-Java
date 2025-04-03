package Exercicio04;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        String name = input.next();
        System.out.print("Valor do empréstimo: ");
        double loan = input.nextDouble();
        System.out.print("Em quantas parcelas dejesa pagar (min 6, max 48): ");
        int quota = input.nextInt();

        SimulacaoEmprestimo calculateLoan = new SimulacaoEmprestimo();

        boolean isValid = quota>=6 && quota<=48;

        if (isValid){
            System.out.println("\nNome: " + name + calculateLoan.CalcularEmprestimo(loan, quota));
        } else {
            System.out.println("Valor de parcelas inválido . . . Mínimo de 6x e Máximo de 48x");
        }
    }
}
