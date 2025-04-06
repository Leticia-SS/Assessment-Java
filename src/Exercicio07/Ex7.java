package Exercicio07;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Nome do Aluno: ");
        String name = input.nextLine();
        System.out.print("Matricula: ");
        int matricula = input.nextInt();

        double[] notas = new double[3];
        System.out.print("Nota 1: ");
        notas[0] = input.nextDouble();
        System.out.print("Nota 2: ");
        notas[1] = input.nextDouble();
        System.out.print("Nota 3: ");
        notas[2] = input.nextDouble();

        Aluno aluno = new Aluno(name, matricula, notas);
        aluno.dadosAluno();

        System.out.println("Média: " + String.format("%.2f",aluno.calcularMedia()));
        System.out.println("Situação Final: " + aluno.verificarAprovacao());
    }
}
